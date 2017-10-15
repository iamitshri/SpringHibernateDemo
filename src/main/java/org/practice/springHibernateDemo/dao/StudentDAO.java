package org.practice.springHibernateDemo.dao;

import java.util.List;

import org.practice.springHibernateDemo.entity.Student;

public interface StudentDAO {
	void add(Student std);
	List<Student> listStudent();
}
