package com.education.educationservice.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.education.educationservice.entity.Course;
import com.education.educationservice.entity.Student;
import com.education.educationservice.service.CourseService;

@Service
public class CourseServiceImp implements CourseService {

	@Override
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCourse(long id, Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getCourseById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
