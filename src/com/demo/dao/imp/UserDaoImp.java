package com.demo.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.demo.dao.UserDao;
import com.demo.domain.User;

public class UserDaoImp extends HibernateDaoSupport implements UserDao {
	/**
	 * 添加用户
	 */
	public void save(User user) {
		this.getHibernateTemplate().save(user);
		
	}
	//根据用户名获取用户
	public User getUser(String name) {
		String hsql="from User u where u.name='"+name+"'";
		User result=(User) ((Query) this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
	}
	//根据id删除用户
	public void delete(int id) {
		this.getHibernateTemplate().delete(fingById(id));
		
	}
	//更新用户
	public void update(User user) {
		this.getHibernateTemplate().update(user);
		
	}
	//根据id查找用户
	public User fingById(int id) {
		User user=this.getHibernateTemplate().get(User.class, id);
		return user;
	}
	//查找所有用户
	public List<User> fingAll() {
		String hsql="from User";
		List<User> list=(List<User>)this.getHibernateTemplate().find(hsql);
		return list;
	}

}
