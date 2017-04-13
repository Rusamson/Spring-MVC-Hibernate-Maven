package com.samson.service;

import java.util.List;

import com.samson.model.Task;

public interface TaskService {
	public void add(Task t);
	public void update(Task t);
	public List<Task> getAll();
	public Task getById(int id);
	public void remove(int id);
}
