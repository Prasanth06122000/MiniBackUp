package com.cg.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.javaguides.springboot.dao.UserService;
import com.cg.javaguides.springboot.dto.UserDemo;
import com.cg.javaguides.springboot.entity.Users;
import com.cg.javaguides.springboot.repositry.UserRepository;



@RestController  //ControllerS
public class UserController {
	
	@Autowired
	//private UserRepository us;
	private UserService us;
	
	@PostMapping("/save")
	public Users Sent(@RequestBody UserDemo user)
	{  
		Users us1=new Users();
		us1.setName(user.getName());
		us1.setEmail(user.getEmail());
		us1.setPassword(user.getPassword());
		us1.setUsername(user.getUsername());
		us1.setRoles(user.getRoles());
		return us.saveRecord(us1);
	}
	
	
    @GetMapping("/AllRecords")
   public List<Users> getAll()
   {
	   return us.getAllRecords();
	   
   }
 
}     
