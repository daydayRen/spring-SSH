package com.demo.service;

import java.util.List;

import com.demo.domain.User;

public interface UserService {
	/**
	 * �����û�
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * �������������û�
	 * @param name
	 * @return
	 */
	User getUser(String name);
	/**
	 * �����û�idɾ���û�
	 * @param id
	 */
	void deleteUser(int id);
	/**
	 * �����û���Ϣ
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * �����û�id�����û�
	 * @param id
	 * @return
	 */
	User findUserById(int id);
	/**
	 * ���������û�
	 * @return
	 */
	List<User> findAll();
}
