package com.samson.service;

import java.util.List;

import com.samson.model.Tracker;

public interface TrackerService {
	public void add(Tracker t);
	public void update(Tracker t);
	public List<Tracker> getAll();
	public Tracker getById(int id);
	public void remove(int id);
}
