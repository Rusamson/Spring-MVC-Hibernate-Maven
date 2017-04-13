package com.samson.dao;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

 
import com.samson.model.Truck;

@Repository
public class TruckDaoImpl implements TruckDao{
	
	private static final Logger logger = LoggerFactory.getLogger(TruckDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void add(Truck t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Truck saved successfully, Truck Details="+t);	
	}

	@Override
	public void update(Truck t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(t);
		logger.info("Truck updated successfully, Truck Details="+t);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Truck> getAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Truck> trucksList = session.createQuery("from Truck").list();
		for(Truck t : trucksList){
			logger.info("Truck List::"+t);
		}
		return trucksList;
	}

	@Override
	public Truck getById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Truck t = (Truck) session.load(Truck.class, new Integer(id));
		logger.info("Truck loaded successfully, Truck details="+t);
		return t;
	}

	@Override
	public void remove(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Truck t = (Truck) session.load(Truck.class, new Integer(id));
		if(null != t){
			session.delete(t);
		}
		logger.info("Truck deleted successfully, Truck details="+t);
		
	}

}
