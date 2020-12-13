package com.klezovich.springbootcoaching.arthur.controller;

import com.klezovich.springbootcoaching.arthur.controller.dto.AddNoteCommentDto;
import com.klezovich.springbootcoaching.arthur.controller.dto.CreateNoteDto;
import com.klezovich.springbootcoaching.arthur.controller.dto.NoteDto;
import com.klezovich.springbootcoaching.arthur.service.NoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {this.noteService = noteService;}

    @PostMapping("/create")
    public void createNote(@RequestBody CreateNoteDto dto) {
        log.info("Create note request received by controller");
        noteService.createNote(dto.getNoteId(), dto.getNoteText());
    }

    @PostMapping("/add_comment")
    public void addCommentToNote(@RequestBody AddNoteCommentDto dto) {
        log.info("Adding comment to a note");
        noteService.addComment(dto.getNoteId(), dto.getCommentText());
    }

    @GetMapping("/get")
    public NoteDto getNote(@RequestParam("noteId") String noteId) {
        return NoteDto.fromNote(noteService.findNoteById(noteId));
    }
}
