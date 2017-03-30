package com.demo.action;

import com.demo.domain.User;
import com.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() throws Exception {
		if(userService.findUserById(user.getId())!=null){
			setUser(user);
			userService.updateUser(user);;
			return SUCCESS;
		}
		addActionMessage(getText("error.message.not.exist!!!"));
		return INPUT;
	}
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
