package com.klezovich.springbootcoaching.arthur.controller.dto;

public class AddNoteCommentDto {

    private String noteId;
    private String commentText;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
