package com.education.educationservice.entity;

/**
 * 
 * akash.kumar
 * 
 **/

public class Course {
	private long id;
	private String name;

	public Course() {
	}

	private Course(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class Builder {
		private long id;
		private String name;

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

		public Course build() {
			return new Course(this);
		}
	}
}
