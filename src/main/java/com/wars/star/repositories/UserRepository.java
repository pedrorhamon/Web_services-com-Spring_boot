package com.wars.star.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wars.star.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
