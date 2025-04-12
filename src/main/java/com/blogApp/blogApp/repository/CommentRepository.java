package com.blogApp.blogApp.repository;

import com.blogApp.blogApp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
