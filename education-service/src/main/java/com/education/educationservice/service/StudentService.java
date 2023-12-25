package com.education.educationservice.service;

import java.util.List;

import com.education.educationservice.entity.Student;

/**
 * 
 * akash.kumar
 * 
 **/

public interface StudentService {
	public boolean addStudent(Student student);

	public boolean updateStudent(long id, Student student);

	public Student getStudentById(long id);

	public List<Student> getStudents();

	public boolean deleteStudent(long id);
}
