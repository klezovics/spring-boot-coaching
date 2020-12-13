package com.klezovich.springbootcoaching.arthur.controller.dto;

import com.klezovich.springbootcoaching.arthur.entity.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteDto {

    private String noteId;
    private String noteText;
    private List<String> comments;
    private List<String> collections;

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

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public static NoteDto fromNote(Note note) {
        var dto = new NoteDto();
        dto.setNoteId(note.getNoteId());
        dto.setNoteText(note.getNoteText());

        var collectionList = new ArrayList<String>();
        note.getNoteCollections().forEach( noteCollection -> collectionList.add(noteCollection.getName()));
        dto.setCollections(collectionList);

        var commentList = new ArrayList<String>();
        note.getComments().forEach( noteComment -> commentList.add(noteComment.getText()));
        dto.setComments(commentList);

        return dto;
    }
}
