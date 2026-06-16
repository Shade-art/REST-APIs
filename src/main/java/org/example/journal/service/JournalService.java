package org.example.journal.service;

import org.example.journal.model.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JournalService {
    private Map<Long, JournalEntry> journalEntries =
            new HashMap<>();

    public void saveEntry(JournalEntry entry)
    {
        journalEntries.put(entry.getId(),entry);
    }

    public Map<Long, JournalEntry> getAllEntries() {
        return journalEntries;
    }

    public JournalEntry showEntryById(Long id)
    {
        return journalEntries.get(id);
    }

    public void updateEntry(Long id , JournalEntry entry)
    {
        journalEntries.put(id,entry);
    }

    public void deleteEntry(Long id)
    {
        journalEntries.remove(id);
    }
}
