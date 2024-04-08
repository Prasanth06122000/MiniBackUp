package com.cg.javaguides.springboot.dao;

import java.util.List;



import com.cg.javaguides.springboot.dto.UserDemo;
import com.cg.javaguides.springboot.entity.Users;

public interface UserService {

	Users saveRecord(Users user);

	List<Users> getAllRecords();

}
