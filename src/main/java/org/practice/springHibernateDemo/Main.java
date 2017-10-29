package org.practice.springHibernateDemo;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.practice.springHibernateDemo.entity.Address;
import org.practice.springHibernateDemo.entity.Course;
import org.practice.springHibernateDemo.entity.Student;
import org.practice.springHibernateDemo.entity.StudentDetail;
import org.practice.springHibernateDemo.entity.Teacher;
import org.practice.springHibernateDemo.service.StudentDetailService;
import org.practice.springHibernateDemo.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	/**
	 * http://www.objectdb.com/java/jpa/persistence/retrieve
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		playWithCourseTeacher();
	}

	static void playWithCourseTeacher() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course_mgmt");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Course course = null;
		Student student=null;
		course = findCourseByName(em, "physics");
		student = findStudentById(em, 6);
		if(student.getCourses()==null) {
			student.setCourses(new HashSet<Course>());
		}
		student.getCourses().add(course);
		if(course.getStudents()==null) {
			course.setStudents(new HashSet<Student>());
		}
		//student is not the owner of the relationship
		// owner of the relation gets to persist the relation
		course.getStudents().add(student);
		em.persist(student);
		txn.commit();
		em.close();
		emf.close();
	}
	
	static void addTeacherForCourse(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course_mgmt");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();

		Course course = null;
		Teacher teacher = null;

		/*
		course = new Course("physics");
		teacher = new Teacher("kulkarni");
		teacher.setCourse(course);
		em.persist(teacher);
		 */
		
		course = findCourseByName(em, "physics");
		
		for(Teacher t :course.getTeachers()) {
			System.out.println(t.getName());
		}
		
		teacher = new Teacher("Vajpeyi");
		teacher.setCourse(course);
		em.persist(teacher);
		
		txn.commit();
		em.close();
		emf.close();
	}
	
	static Course findCourseByName(EntityManager em,String name){
		TypedQuery<Course> query = em.createQuery("select c from Course c where c.name=:name", Course.class);
		Course course = query.setParameter("name", name).getSingleResult();
		return course;
	}

	static void playWithStudentAddress() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course_mgmt");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();

		Student student = null;
		Address address = null;

		student = add_Student_studentDetail("ramesh");
		address = add_Student_studentDetail_address(student, "tarapur road");

		student = findStudentById(em, 1);
		address = add_Student_studentDetail_address(student, "11014 Kansas city");

		em.persist(address);
		txn.commit();
		em.close();
		emf.close();
	}

	static Student findStudentById(EntityManager em, long id) {
		Student stud = em.find(Student.class, id);
		return stud;
	}

	void invokeUsingServices() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService studentService = ctx.getBean(StudentService.class);
		StudentDetailService sdSvc = ctx.getBean(StudentDetailService.class);
		ctx.close();
	}

	static Student add_Student_studentDetail(String name) {
		// Add a student
		Student s1 = new Student();
		s1.setName(name);
		StudentDetail studentDetail = new StudentDetail();
		s1.setStudentDetail(studentDetail);
		return s1;
	}

	static Address add_Student_studentDetail_address(Student stud, String address) {
		// Add address of student
		Address addr = new Address();
		addr.setAddress(address);
		addr.setStudent(stud);
		return addr;
	}

}
