package org.example.journal.controller;


import org.example.journal.model.JournalEntry;
import org.example.journal.repository.JournalRepository;
import org.example.journal.service.JournalService;
import org.springframework.web.bind.annotation.*;

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
    public boolean createEntry(@RequestBody JournalEntry entry)
    {
        journalService.saveEntry(entry);
        return true;
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
