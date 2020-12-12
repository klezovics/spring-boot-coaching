package com.klezovich.springbootcoaching.arthur.repository;

import com.klezovich.springbootcoaching.arthur.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note,Long> {

    public Note findByNoteId(String noteId);
}
