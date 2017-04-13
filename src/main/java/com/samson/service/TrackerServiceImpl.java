package com.samson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.samson.dao.TrackerDao;
import com.samson.model.Tracker;

@Service
public class TrackerServiceImpl implements TrackerService {
	private TrackerDao trackerDao;
	
	public void setTrackerDao(TrackerDao trackerDao) {
		this.trackerDao = trackerDao;
	}
	@Override
	@Transactional
	public void add(Tracker t) {
	this.trackerDao.add(t);
	}

	@Override
	@Transactional
	public void update(Tracker t) {
	this.trackerDao.update(t);
	}

	@Override
	@Transactional
	public List<Tracker> getAll() { 
		return this.trackerDao.getAll();
	}

	@Override
	@Transactional
	public Tracker getById(int id) { 
		return this.trackerDao.getById(id);
	}

	@Override
	@Transactional
	public void remove(int id) {
	this.trackerDao.remove(id);
	}

}
