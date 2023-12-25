package com.education.educationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.educationservice.entity.Student;
import com.education.educationservice.service.StudentService;

@RestController
@RequestMapping("/education")
public class EducationController {

	@Autowired
	StudentService studentService;

	@GetMapping("/get-all-students")
	public List<Student> getAllStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/get-student/{id}")
	public Student getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/register-student")
	public boolean registerStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping("update-student/{id}")
	public boolean updateStudent(@PathVariable long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping("remove-student/{id}")
	public boolean removeStudent(@PathVariable long id) {
		return studentService.deleteStudent(id);
	}

}
