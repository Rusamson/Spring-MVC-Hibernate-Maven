package com.samson.dao;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

 
import com.samson.model.Tracker;

@Repository
public class TrackerDaoImpl implements TrackerDao{
	
	private static final Logger logger = LoggerFactory.getLogger(TaskDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void add(Tracker t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Tracker saved successfully, Tracker Details="+t);	
	}

	@Override
	public void update(Tracker t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(t);
		logger.info("Tracker updated successfully, Tracker Details="+t);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Tracker> getAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Tracker> trackersList = session.createQuery("from Tracker").list();
		for(Tracker t : trackersList){
			logger.info("Tracker List::"+t);
		}
		return trackersList;
	}

	@Override
	public Tracker getById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Tracker t = (Tracker) session.load(Tracker.class, new Integer(id));
		logger.info("Tracker loaded successfully, Tracker details="+t);
		return t;
	}

	@Override
	public void remove(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Tracker t = (Tracker) session.load(Tracker.class, new Integer(id));
		if(null != t){
			session.delete(t);
		}
		logger.info("Tracker deleted successfully, Tracker details="+t);
		
	}

}
