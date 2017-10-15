package org.practice.springHibernateDemo.service.impl;

 
import org.practice.springHibernateDemo.dao.CourseDAO;
import org.practice.springHibernateDemo.entity.Course;
import org.practice.springHibernateDemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDAO dao;
	
	@Transactional
	public void add(Course s) {
		dao.add(s);
	}

}
