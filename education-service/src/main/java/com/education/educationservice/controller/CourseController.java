package com.education.educationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.educationservice.entity.Course;
import com.education.educationservice.service.CourseService;

/**
 * 
 * akash.kumar
 * 
 **/

@Controller
@RestController("/course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/get-all-courses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	@GetMapping("/get-course/{id}")
	public Course getCourseById(@PathVariable long id) {
		return courseService.getCourseById(id);
	}

	@PostMapping("/add-course")
	public boolean addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	@PutMapping("/update-course/{id}")
	public boolean updateCourseById(@PathVariable long id, @RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}

	@DeleteMapping("/delete-course/{id}")
	public boolean deleteCourseById(@PathVariable long id) {
		return courseService.deleteCourse(id);
	}

}
