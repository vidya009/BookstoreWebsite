package com.vidyab.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyab.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}