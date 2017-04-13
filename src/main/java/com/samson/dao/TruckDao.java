package com.samson.dao;

import java.util.List;

import com.samson.model.Truck;

public interface TruckDao {
	public void add(Truck t);
	public void update(Truck t);
	public List<Truck> getAll();
	public Truck getById(int id);
	public void remove(int id);
}
