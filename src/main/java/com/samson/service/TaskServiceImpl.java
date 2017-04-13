package com.samson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.samson.dao.TaskDao;
import com.samson.model.Task;

@Service
public class TaskServiceImpl implements TaskService {
	private TaskDao taskDao;
	
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}
	@Override
	@Transactional
	public void add(Task t) {
	this.taskDao.add(t);
	}

	@Override
	@Transactional
	public void update(Task t) {
	this.taskDao.update(t);
	}

	@Override
	@Transactional
	public List<Task> getAll() { 
		return this.taskDao.getAll();
	}

	@Override
	@Transactional
	public Task getById(int id) { 
		return this.taskDao.getById(id);
	}

	@Override
	@Transactional
	public void remove(int id) {
	this.taskDao.remove(id);
	}

}
