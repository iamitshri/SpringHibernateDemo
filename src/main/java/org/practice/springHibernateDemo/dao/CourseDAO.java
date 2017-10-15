package org.practice.springHibernateDemo.dao;

import java.util.List;

import org.practice.springHibernateDemo.entity.Course;

public interface CourseDAO {
	void add(Course course);
	List<Course> listCourses();
}
