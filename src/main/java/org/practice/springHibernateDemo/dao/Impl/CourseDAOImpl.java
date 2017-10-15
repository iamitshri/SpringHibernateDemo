package org.practice.springHibernateDemo.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.practice.springHibernateDemo.dao.CourseDAO;
import org.practice.springHibernateDemo.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDAOImpl implements CourseDAO{

	@PersistenceContext
	private EntityManager em;
	
	public void add(Course course) {
		 em.persist(course);
		
	}

	public List<Course> listCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
