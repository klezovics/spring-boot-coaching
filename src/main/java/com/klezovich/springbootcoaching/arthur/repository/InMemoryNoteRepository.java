package com.klezovich.springbootcoaching.arthur.repository;

import com.klezovich.springbootcoaching.arthur.entity.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryNoteRepository {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    Map<String,Note> noteIdToNoteMap = new HashMap<>();

    public void saveNote(Note note) {
        log.info("Saving note in repository");
        noteIdToNoteMap.put(note.getNoteId(),note);
        log.info("Note saved");
    }

    public Note getNoteById(String noteId) {
       return noteIdToNoteMap.get(noteId);
    }
}
