package com.klezovich.springbootcoaching.arthur.service;

import com.klezovich.springbootcoaching.arthur.entity.Note;
import com.klezovich.springbootcoaching.arthur.repository.InMemoryNoteRepository;
import com.klezovich.springbootcoaching.arthur.repository.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final NoteRepository repository;

    @Autowired
    public NoteService(NoteRepository repository) {this.repository = repository;}

    public Note createNote(String noteId, String noteContent) {
        var note = new Note(noteId,noteContent);
        log.info("Create note request received by SERVICE");
        repository.save(note);
        return note;
    }

    public Note findNoteById(String noteId) {
        var note = repository.findByNoteId(noteId);
        if( null == note ) {
            throw new RuntimeException("Note not found");
        }

        return note;
    }
}
