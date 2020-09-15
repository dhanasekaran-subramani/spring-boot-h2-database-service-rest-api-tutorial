package com.ds2technologies.tutorials.repository;

import com.ds2technologies.tutorials.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
