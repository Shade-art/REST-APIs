package org.example.journal.controller;


import org.example.journal.dto.JournalEntryRequestDTO;
import org.example.journal.model.JournalEntry;
import org.example.journal.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalController {
    private JournalService journalService;
    JournalController(JournalService journalService)
    {
        this.journalService = journalService;
    }

    @PostMapping
    public String createEntry(@RequestBody JournalEntryRequestDTO dto)
    {
        //creating object of entry
        JournalEntry entry = new JournalEntry();

        //adding all things to entry
        entry.setId(System.currentTimeMillis()); //from us
        entry.setTitle(dto.getTitle()); //from user
        entry.setContent(dto.getContent());//from user
        entry.setCreatedAt(String.valueOf(LocalDateTime.now()));//from us

        journalService.saveEntry(entry);
        return "Entry has been saved";
    }

    @GetMapping
    public Map<Long, JournalEntry> getAllEntries()
    {
        return journalService.getAllEntries();
    }

    @GetMapping("/{id}")
    public JournalEntry getEntryById(@PathVariable Long id)
    {
        return journalService.showEntryById(id);
    }

    @PutMapping("/{id}")
    public boolean updateEntry(@PathVariable Long id , @RequestBody JournalEntry entry)
    {
        journalService.updateEntry(id,entry);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean deleteEntry(@PathVariable Long id)
    {
        journalService.deleteEntry(id);
        return true;
    }
}
