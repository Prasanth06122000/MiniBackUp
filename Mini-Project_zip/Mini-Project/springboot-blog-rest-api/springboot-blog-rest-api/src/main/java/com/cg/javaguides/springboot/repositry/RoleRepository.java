package com.cg.javaguides.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.javaguides.springboot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
