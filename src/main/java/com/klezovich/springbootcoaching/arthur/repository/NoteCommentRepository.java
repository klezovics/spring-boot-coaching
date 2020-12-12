package com.klezovich.springbootcoaching.arthur.repository;

import com.klezovich.springbootcoaching.arthur.entity.NoteComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteCommentRepository extends CrudRepository<NoteComment,Long> {
}
