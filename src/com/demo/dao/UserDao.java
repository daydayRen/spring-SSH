package com.demo.dao;

import java.util.List;

import com.demo.domain.User;



public interface UserDao {
	//添加用户
	void save(User user);
	//按用户名查找用户
	User getUser(String name);
	//根据id删除用户
	void delete(int id);
	//更新用户
	void update(User user);
	//根据id查找用户
	User fingById(int id);
	//查找所有用户
	List<User> fingAll();
}
