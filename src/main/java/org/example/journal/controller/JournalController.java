package org.example.journal.controller;


import org.example.journal.dto.JournalEntryRequestDTO;
import org.example.journal.dto.JournalResponseDTO;
import org.example.journal.model.JournalEntry;
import org.example.journal.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalController {
    private JournalService journalService;
    private JournalEntry entry;
    JournalController(JournalService journalService , JournalEntry entry)
    {
        this.journalService = journalService;
        this.entry = entry;
    }

    @PostMapping
    public String createEntry(@RequestBody JournalEntryRequestDTO dto)
    {
        //creating object of JournalResponseDTO
        JournalResponseDTO response = new JournalResponseDTO();


        //adding all things to entry
        entry.setId(System.currentTimeMillis()); //from us
        entry.setId(System.currentTimeMillis());
        entry.setTitle(dto.getTitle());
        entry.setContent(dto.getContent());
        entry.setCreatedAt(String.valueOf(LocalDateTime.now()));

        journalService.saveEntry(entry);

        response.setTitle(dto.getTitle()); //from user
        response.setContent(dto.getContent());//from user
        response.setCreatedAt(String.valueOf(LocalDateTime.now()));//from us


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
