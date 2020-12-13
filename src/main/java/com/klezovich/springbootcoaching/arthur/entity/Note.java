package com.klezovich.springbootcoaching.arthur.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private Long id;
    private String noteId;
    private String noteText;

    @OneToMany(mappedBy = "note" )
    private List<NoteComment> comments = new ArrayList<>();

    @ManyToMany(mappedBy = "collectionNotes")
    private List<NoteCollection> noteCollections = new ArrayList<>();

    public Note() {}

    public Note(String noteId, String noteText) {
        this.noteId = noteId;
        this.noteText = noteText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public List<NoteComment> getComments() {
        return comments;
    }

    public void setComments(List<NoteComment> comments) {
        this.comments = comments;
    }

    public List<NoteCollection> getNoteCollections() {
        return noteCollections;
    }

    public void setNoteCollections(List<NoteCollection> noteCollections) {
        this.noteCollections = noteCollections;
    }
}
