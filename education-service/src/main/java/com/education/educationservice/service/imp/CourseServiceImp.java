package com.education.educationservice.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.education.educationservice.entity.Course;
import com.education.educationservice.service.CourseService;

/**
 * 
 * akash.kumar
 * 
 **/

@Service
public class CourseServiceImp implements CourseService {
	private List<Course> courses = new ArrayList<>();

	@Override
	public boolean addCourse(Course course) {
		courses.add(course);
		return true;
	}

	@Override
	public boolean updateCourse(long id, Course course) {
		Course existCourse = courses.stream().filter(c -> c.getId() == id).findAny().orElse(null);
		if (existCourse == null)
			return false;
		existCourse.setName(course.getName());
		return true;
	}

	@Override
	public Course getCourseById(long id) {
		return courses.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public boolean deleteCourse(long id) {
		if (courses.isEmpty()) {
			return false;
		}
		return courses.removeIf(c -> c.getId() == id);
	}

}
