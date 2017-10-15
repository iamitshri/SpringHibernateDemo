package org.practice.springHibernateDemo.dao;

import java.util.List;

import org.practice.springHibernateDemo.entity.StudentDetail;

public interface StudentDetailDAO {
	void add(StudentDetail sd);
	List<StudentDetail> listStudentDetails();
}
