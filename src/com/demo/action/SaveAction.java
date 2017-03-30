package com.demo.action;

import com.demo.domain.User;
import com.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveAction extends ActionSupport {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() throws Exception {
		User u=new User();
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		u.setType(user.getType());
		userService.saveUser(u);
		return SUCCESS;
	}
}
