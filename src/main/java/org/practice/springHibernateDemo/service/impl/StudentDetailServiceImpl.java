package org.practice.springHibernateDemo.service.impl;

import org.practice.springHibernateDemo.dao.StudentDetailDAO;
import org.practice.springHibernateDemo.entity.StudentDetail;
import org.practice.springHibernateDemo.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentDetailServiceImpl implements StudentDetailService {

	@Autowired
	StudentDetailDAO dao;

	@Transactional
	public void add(StudentDetail sd) {
		dao.add(sd);

	}

}
