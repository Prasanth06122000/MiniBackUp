package com.cg.javaguides.springboot.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.cg.javaguides.springboot.entity.Role;

public class UserDemo {
	
	 private String name;
	    private String username;
	    private String email;
	    private String password;
	    private Set<Role> roles;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Set<Role> getRoles() {
			return roles;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		public UserDemo(String name, String username, String email, String password, Set<Role> roles) {
			super();
			this.name = name;
			this.username = username;
			this.email = email;
			this.password = password;
			this.roles = roles;
		}
	
	    
	    

}
