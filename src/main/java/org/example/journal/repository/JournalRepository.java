package org.example.journal.repository;

import org.example.journal.model.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class JournalRepository {
    private final Map<Long, JournalEntry> journalEntries = new HashMap<>();


    public void saveData(JournalEntry entry)
    {
        journalEntries.put(entry.getId(),entry);
    }

    public Map<Long,JournalEntry> findAll()
    {
        return journalEntries;
    }

    public JournalEntry findByid(Long id)
    {
        return journalEntries.get(id);
    }

    public boolean edit(Long id,JournalEntry entry)
    {
        journalEntries.put(entry.getId(),entry);
        return true;
    }

    public boolean delete(Long id)
    {
        journalEntries.remove(id);
        return true;
    }



}
