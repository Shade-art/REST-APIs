package org.example.journal.exception;

public class JournalEntryNotFoundException extends RuntimeException {

    public JournalEntryNotFoundException(String message)
    {
        super(message);
    }
}
