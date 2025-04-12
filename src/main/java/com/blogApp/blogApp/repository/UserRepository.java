package com.blogApp.blogApp.repository;

import com.blogApp.blogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
