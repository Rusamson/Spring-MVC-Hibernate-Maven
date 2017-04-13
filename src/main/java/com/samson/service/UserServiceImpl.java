package com.samson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.samson.dao.UserDao;
import com.samson.model.User;

@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	@Transactional
	public void add(User u) {
	this.userDao.add(u);
	}

	@Override
	@Transactional
	public void update(User u) {
	this.userDao.update(u);
	}

	@Override
	@Transactional
	public List<User> getAll() { 
		return this.userDao.getAll();
	}

	@Override
	@Transactional
	public User getById(int id) { 
		return this.userDao.getById(id);
	}

	@Override
	@Transactional
	public void remove(int id) {
	this.userDao.remove(id);
	}

}
