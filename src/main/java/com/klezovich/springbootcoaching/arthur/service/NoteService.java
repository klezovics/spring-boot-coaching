package com.klezovich.springbootcoaching.arthur.service;

import com.klezovich.springbootcoaching.arthur.entity.Note;
import com.klezovich.springbootcoaching.arthur.entity.NoteComment;
import com.klezovich.springbootcoaching.arthur.repository.NoteCommentRepository;
import com.klezovich.springbootcoaching.arthur.repository.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final NoteRepository repository;
    private final NoteCommentRepository noteCommentRepository;

    @Autowired
    public NoteService(
        NoteRepository repository,
        NoteCommentRepository noteCommentRepository
    ) {
        this.repository = repository;
        this.noteCommentRepository = noteCommentRepository;
    }

    public Note createNote(String noteId, String noteContent) {
        log.info("Create note request received by SERVICE");

        var note = new Note(noteId, noteContent);
        note = repository.save(note);

        return note;
    }

    public Note findNoteById(String noteId) {
        var note = repository.findByNoteId(noteId);
        if (null == note) {
            throw new RuntimeException("Note not found");
        }

        return note;
    }

    public void addComment(String noteId, String commentText) {
        var note = findNoteById(noteId);

        var noteComment = new NoteComment(commentText);
        noteComment.setNote(note);

        noteCommentRepository.save(noteComment);
    }
}
