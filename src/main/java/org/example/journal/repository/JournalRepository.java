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

}
