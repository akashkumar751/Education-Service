package com.education.educationservice.entity;

/**
 * 
 * akash.kumar
 * 
 **/

public class Student {
	private long id;
	private String name;
	private long courseId;

	public Student() {
	}

	private Student(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.courseId = builder.courseId;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public static class Builder {
		private long id;
		private String name;
		private long courseId;

		public Builder(long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder courseId(long courseId) {
			this.courseId = courseId;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}
}
