package com.samson.dao;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.samson.model.GpsCoordinate; 

@Repository
public class GpsCoordinateDAOImpl implements GpsCoordinateDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(GpsCoordinateDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void add(GpsCoordinate p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details="+p);	
	}

	@Override
	public void update(GpsCoordinate p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<GpsCoordinate> getAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<GpsCoordinate> coordinatesList = session.createQuery("from GpsCoordinate").list();
		for(GpsCoordinate c : coordinatesList){
			logger.info("Coordinates List::"+c);
		}
		return coordinatesList;
	}

	@Override
	public GpsCoordinate getById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		GpsCoordinate c = (GpsCoordinate) session.load(GpsCoordinate.class, new Integer(id));
		logger.info("GpsCoordinate loaded successfully, GpsCoordinate details="+c);
		return c;
	}

	@Override
	public void remove(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		GpsCoordinate c = (GpsCoordinate) session.load(GpsCoordinate.class, new Integer(id));
		if(null != c){
			session.delete(c);
		}
		logger.info("Person deleted successfully, person details="+c);
		
	}

}
