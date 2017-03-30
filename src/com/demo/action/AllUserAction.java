package com.demo.action;

import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.demo.domain.User;
import com.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class AllUserAction extends ActionSupport {
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		List<User> list=(List<User>)userService.findAll();
		
		ServletActionContext.getRequest().setAttribute("list", list);
		return SUCCESS;
	}
}
