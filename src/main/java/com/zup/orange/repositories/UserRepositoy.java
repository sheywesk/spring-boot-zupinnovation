package com.zup.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.orange.models.User;

@Repository
public interface UserRepositoy extends JpaRepository<User, Long>{}
