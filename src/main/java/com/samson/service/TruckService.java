package com.samson.service;

import java.util.List;

import com.samson.model.Truck;

public interface TruckService {
	public void add(Truck t);
	public void update(Truck t);
	public List<Truck> getAll();
	public Truck getById(int id);
	public void remove(int id);
}
