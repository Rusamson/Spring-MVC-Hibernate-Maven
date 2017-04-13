package com.samson.service;

import java.util.List;

import com.samson.model.GpsCoordinate;

public interface GpsCoordinateService {
	public void add(GpsCoordinate c);
	public void update(GpsCoordinate c);
	public List<GpsCoordinate> getAll();
	public GpsCoordinate getById(int id);
	public void remove(int id);
}
