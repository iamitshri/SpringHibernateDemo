package org.practice.springHibernateDemo.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.practice.springHibernateDemo.dao.TeacherDAO;
import org.practice.springHibernateDemo.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDAOImpl implements TeacherDAO {

	@PersistenceContext
	private EntityManager em;

	public void add(Teacher t) {
		em.persist(t);
	}

	public List<Teacher> listTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

}
