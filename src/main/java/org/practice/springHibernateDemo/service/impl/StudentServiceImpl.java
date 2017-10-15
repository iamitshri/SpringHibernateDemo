package org.practice.springHibernateDemo.service.impl;

import org.practice.springHibernateDemo.dao.StudentDAO;
import org.practice.springHibernateDemo.entity.Student;
import org.practice.springHibernateDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	
	@Transactional
	public void add(Student s) {
		 dao.add(s);
	}

}
