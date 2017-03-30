package com.demo.service;

import java.util.List;

import com.demo.domain.User;

public interface UserService {
	/**
	 * 保存用户
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * 根据姓名查找用户
	 * @param name
	 * @return
	 */
	User getUser(String name);
	/**
	 * 根据用户id删除用户
	 * @param id
	 */
	void deleteUser(int id);
	/**
	 * 更新用户信息
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * 根据用户id查找用户
	 * @param id
	 * @return
	 */
	User findUserById(int id);
	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> findAll();
}
