package org.practice.springHibernateDemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_detail")
public class StudentDetail {
	@Id
	@Column(name = "student_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentDetailId;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "studentDetail")
	private Student student;

	public int getStudentDetailId() {
		return studentDetailId;
	}

	public void setStudentDetailId(int studentDetailId) {
		this.studentDetailId = studentDetailId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
