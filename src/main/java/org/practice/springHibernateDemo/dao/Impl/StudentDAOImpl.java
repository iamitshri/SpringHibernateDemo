package org.practice.springHibernateDemo.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.practice.springHibernateDemo.dao.StudentDAO;
import org.practice.springHibernateDemo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void add(Student std) {
		em.persist(std);
		
	}

	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return null;
	}
 

}
