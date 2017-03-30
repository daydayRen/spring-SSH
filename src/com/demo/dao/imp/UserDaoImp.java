package com.demo.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.demo.dao.UserDao;
import com.demo.domain.User;

public class UserDaoImp extends HibernateDaoSupport implements UserDao {
	/**
	 * ����û�
	 */
	public void save(User user) {
		this.getHibernateTemplate().save(user);
		
	}
	//�����û�����ȡ�û�
	public User getUser(String name) {
		String hsql="from User u where u.name='"+name+"'";
		User result=(User) ((Query) this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
	}
	//����idɾ���û�
	public void delete(int id) {
		this.getHibernateTemplate().delete(fingById(id));
		
	}
	//�����û�
	public void update(User user) {
		this.getHibernateTemplate().update(user);
		
	}
	//����id�����û�
	public User fingById(int id) {
		User user=this.getHibernateTemplate().get(User.class, id);
		return user;
	}
	//���������û�
	public List<User> fingAll() {
		String hsql="from User";
		List<User> list=(List<User>)this.getHibernateTemplate().find(hsql);
		return list;
	}

}
