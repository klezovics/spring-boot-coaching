package com.klezovich.springbootcoaching.arthur.entity;

public class Note {

    private String noteId;
    private String noteText;

    public Note(String noteId, String noteText) {
        this.noteId = noteId;
        this.noteText = noteText;
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


}
