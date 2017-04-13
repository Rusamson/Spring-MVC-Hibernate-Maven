package com.samson.dao;

import java.util.List;

import com.samson.model.GpsCoordinate;

public interface GpsCoordinateDAO {
	public void add(GpsCoordinate c);
	public void update(GpsCoordinate c);
	public List<GpsCoordinate> getAll();
	public GpsCoordinate getById(int id);
	public void remove(int id);
}
