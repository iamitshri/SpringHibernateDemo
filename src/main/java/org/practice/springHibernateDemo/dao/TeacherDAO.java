package org.practice.springHibernateDemo.dao;

import java.util.List;

import org.practice.springHibernateDemo.entity.Teacher;

public interface TeacherDAO {
	void add(Teacher t);
	List<Teacher> listTeacher();
}
