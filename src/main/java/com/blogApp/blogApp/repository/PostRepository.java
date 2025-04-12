package com.blogApp.blogApp.repository;

import com.blogApp.blogApp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
