package com.samson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.samson.dao.GpsCoordinateDAO;
import com.samson.model.GpsCoordinate;

@Service
public class GpsCoordinateServiceImpl implements GpsCoordinateService {
	private GpsCoordinateDAO coordinateDAO;
	
	public void setGpsCoordinateDAO(GpsCoordinateDAO coordinateDAO) {
		this.coordinateDAO = coordinateDAO;
	}
	@Override
	@Transactional
	public void add(GpsCoordinate c) {
	this.coordinateDAO.add(c);
	}

	@Override
	@Transactional
	public void update(GpsCoordinate c) {
	this.coordinateDAO.update(c);
	}

	@Override
	@Transactional
	public List<GpsCoordinate> getAll() { 
		return this.coordinateDAO.getAll();
	}

	@Override
	@Transactional
	public GpsCoordinate getById(int id) { 
		return this.coordinateDAO.getById(id);
	}

	@Override
	@Transactional
	public void remove(int id) {
	this.coordinateDAO.remove(id);
	}

}
