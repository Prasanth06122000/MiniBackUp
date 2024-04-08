package com.cg.javaguides.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.javaguides.springboot.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
