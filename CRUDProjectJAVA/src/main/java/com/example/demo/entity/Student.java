package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int coursefee;
	private int semester;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(int coursefee) {
		this.coursefee = coursefee;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", coursefee=" + coursefee + ", semester=" + semester + "]";
	}

}
