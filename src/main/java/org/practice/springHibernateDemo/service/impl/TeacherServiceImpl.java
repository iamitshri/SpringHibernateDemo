package org.practice.springHibernateDemo.service.impl;

import org.practice.springHibernateDemo.dao.TeacherDAO;
import org.practice.springHibernateDemo.entity.Teacher;
import org.practice.springHibernateDemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherDAO dao;

	@Transactional
	public void add(Teacher t) {
		dao.add(t);

	}

}
