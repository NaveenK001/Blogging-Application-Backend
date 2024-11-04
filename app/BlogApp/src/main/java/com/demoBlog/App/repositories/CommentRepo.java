package com.demoBlog.App.repositories;

import com.demoBlog.App.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
