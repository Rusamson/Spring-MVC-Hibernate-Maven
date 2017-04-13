package com.samson.dao;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

 
import com.samson.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao{
	
	private static final Logger logger = LoggerFactory.getLogger(TaskDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void add(Task t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Task saved successfully, Task Details="+t);	
	}

	@Override
	public void update(Task t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(t);
		logger.info("Task updated successfully, Task Details="+t);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Task> getAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Task> coordinatesList = session.createQuery("from Task").list();
		for(Task t : coordinatesList){
			logger.info("Task List::"+t);
		}
		return coordinatesList;
	}

	@Override
	public Task getById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Task t = (Task) session.load(Task.class, new Integer(id));
		logger.info("Task loaded successfully, Task details="+t);
		return t;
	}

	@Override
	public void remove(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Task t = (Task) session.load(Task.class, new Integer(id));
		if(null != t){
			session.delete(t);
		}
		logger.info("Task deleted successfully, Task details="+t);
		
	}

}
