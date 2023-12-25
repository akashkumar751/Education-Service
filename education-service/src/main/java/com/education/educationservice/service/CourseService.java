package com.education.educationservice.service;

import java.util.List;

import com.education.educationservice.entity.Course;
import com.education.educationservice.entity.Student;

/**
 * 
 * akash.kumar
 * 
 **/

public interface CourseService {
	public boolean addCourse(Course course);

	public boolean updateCourse(long id, Course course);

	public Course getCourseById(long id);

	public List<Course> getCourses();

	public boolean deleteCourse(long id);

}
