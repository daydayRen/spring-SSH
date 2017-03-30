package com.demo.dao;

import java.util.List;

import com.demo.domain.User;



public interface UserDao {
	//����û�
	void save(User user);
	//���û��������û�
	User getUser(String name);
	//����idɾ���û�
	void delete(int id);
	//�����û�
	void update(User user);
	//����id�����û�
	User fingById(int id);
	//���������û�
	List<User> fingAll();
}
