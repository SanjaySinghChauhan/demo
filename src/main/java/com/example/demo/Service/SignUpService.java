package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.IUserDao;
import com.example.demo.Entity.User;

@Service
public class SignUpService  implements ISignUpService{
	
	 @Autowired
	 IUserDao userDao;
	
	@Override
	public void signUpFormSubmition(User user) {
		 userDao.addUser(user);
		
	}
}
