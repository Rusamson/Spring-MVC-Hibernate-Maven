package com.samson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.samson.dao.TruckDao;
import com.samson.model.Truck;

@Service
public class TruckServiceImpl implements TruckService {
	private TruckDao truckDao;
	
	public void setTruckDao(TruckDao truckDao) {
		this.truckDao = truckDao;
	}
	@Override
	@Transactional
	public void add(Truck t) {
	this.truckDao.add(t);
	}

	@Override
	@Transactional
	public void update(Truck t) {
	this.truckDao.update(t);
	}

	@Override
	@Transactional
	public List<Truck> getAll() { 
		return this.truckDao.getAll();
	}

	@Override
	@Transactional
	public Truck getById(int id) { 
		return this.truckDao.getById(id);
	}

	@Override
	@Transactional
	public void remove(int id) {
	this.truckDao.remove(id);
	}

}
