package org.example.journal.service;

import org.example.journal.exception.JournalEntryNotFoundException;
import org.example.journal.model.JournalEntry;
import org.example.journal.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JournalService {
    JournalRepository journalRepository;

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public void saveEntry(JournalEntry entry) {
        journalRepository.saveData(entry);
    }


    public Map<Long, JournalEntry> getAllEntries() {
        return journalRepository.findAll();
    }

    public JournalEntry showEntryById(Long id)
    {
        JournalEntry entry = journalRepository.findById(id);
        if(entry == null)
            throw new JournalEntryNotFoundException("Entry not found with id : "+ id);
        return entry;
    }

    public void updateEntry(Long id, JournalEntry entry) {
        journalRepository.edit(id, entry);
    }

    public void deleteEntry(Long id)
    {
        journalRepository.delete(id);
    }
}