package com.project.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.entity.User;

public interface Userrepo extends JpaRepository<User, Integer>{

}
