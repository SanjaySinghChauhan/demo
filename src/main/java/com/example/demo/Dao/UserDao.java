package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class UserDao implements IUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		 Session session = sessionFactory.getCurrentSession();
	     session.save(user);
		
	}

}
