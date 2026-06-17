package org.example.journal.service;

import org.example.journal.model.JournalEntry;
import org.example.journal.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JournalService {
    JournalRepository journalRepository;
    public JournalService (JournalRepository journalRepository)
    {
        this.journalRepository = journalRepository;
    }
    public void saveEntry(JournalEntry entry)
    {
        journalRepository.saveData(entry);
    }


    public Map<Long, JournalEntry> getAllEntries() {
        return journalRepository.findAll();
    }
//
//    public JournalEntry showEntryById(Long id)
//    {
////        return journalEntries.get(id);
//    }
//
//    public void updateEntry(Long id , JournalEntry entry)
//    {
////        journalEntries.put(id,entry);
//    }
//
//    public void deleteEntry(Long id)
//    {
////        journalEntries.remove(id);
//    }
}
