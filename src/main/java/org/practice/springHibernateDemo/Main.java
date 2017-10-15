package org.practice.springHibernateDemo;

import org.practice.springHibernateDemo.entity.Student;
import org.practice.springHibernateDemo.entity.StudentDetail;
import org.practice.springHibernateDemo.service.StudentDetailService;
import org.practice.springHibernateDemo.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService studentService = ctx.getBean(StudentService.class);
		StudentDetailService sdSvc = ctx.getBean(StudentDetailService.class);

		Student s1 = new Student();
		s1.setName("Amit");
		StudentDetail sd1 = new StudentDetail();
		s1.setStudentDetail(sd1);
		studentService.add(s1);
		 sdSvc.add(sd1);

		ctx.close();
	}
}
