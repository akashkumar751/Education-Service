package com.education.educationservice.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.education.educationservice.entity.Student;
import com.education.educationservice.service.StudentService;

/**
 * 
 * akash.kumar
 * 
 **/

@Service
public class StudentServiceImp implements StudentService {
	private List<Student> students = new ArrayList<>();

	@Override
	public boolean addStudent(Student student) {
		if (student != null) {
			students.add(student);
		}
		return true;
	}

	@Override
	public boolean updateStudent(long id, Student student) {
		Student existingStudent = students.stream().filter(s -> s.getId() == id).findAny().orElse(null);
		if (existingStudent == null) {
			return false;
		}
		existingStudent.setCourseId(student.getCourseId());
		existingStudent.setName(student.getName());
		return true;
	}

	@Override
	public Student getStudentById(long id) {
		return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public boolean deleteStudent(long id) {
		if (students.isEmpty()) {
			return false;
		}

		return students.removeIf(s -> s.getId() == id);
	}

}
