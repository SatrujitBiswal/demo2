package com.Transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Transport.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
