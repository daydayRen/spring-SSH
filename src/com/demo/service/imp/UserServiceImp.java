package com.demo.service.imp;

import java.util.List;

import com.demo.dao.UserDao;
import com.demo.domain.User;
import com.demo.service.UserService;

public class UserServiceImp implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void saveUser(User user) {
		//防止数据库中已经有该用户
		if((userDao.fingById(user.getId()))==null){
			userDao.save(user);
		}
		
	}

	public User getUser(String name) {
		
		return userDao.getUser(name);
	}

	public void deleteUser(int id) {
		if(userDao.fingById(id)!=null){
			userDao.delete(id);
		}
	}

	public void updateUser(User user) {
		if(userDao.fingById(user.getId())!=null){
			userDao.update(user);
		}
	}

	public User findUserById(int id) {
		
		return userDao.fingById(id);
	}

	public List<User> findAll() {
	
		return userDao.fingAll();
	}

}
