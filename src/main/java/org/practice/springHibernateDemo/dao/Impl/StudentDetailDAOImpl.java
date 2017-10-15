package org.practice.springHibernateDemo.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.practice.springHibernateDemo.dao.StudentDetailDAO;
import org.practice.springHibernateDemo.entity.StudentDetail;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDetailDAOImpl implements StudentDetailDAO{

	@PersistenceContext
	private EntityManager em; 
	
	public void add(StudentDetail sd) {
		 em.persist(sd);
		
	}

	public List<StudentDetail> listStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
