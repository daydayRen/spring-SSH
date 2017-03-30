package com.demo.action;

import com.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport {
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() throws Exception {
		userService.deleteUser(id);
		return SUCCESS;
	}
}
