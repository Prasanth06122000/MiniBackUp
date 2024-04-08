package com.cg.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.javaguides.springboot.dao.UserService;
import com.cg.javaguides.springboot.dto.UserDemo;
import com.cg.javaguides.springboot.entity.Users;
import com.cg.javaguides.springboot.repositry.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository ur;
	@Override
	public Users saveRecord(Users user) {
		// TODO Auto-generated method stub
		
		
		return ur.save(user);
	}
	@Override
	public List<Users> getAllRecords() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}
	
	

}
