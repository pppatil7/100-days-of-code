package com.practice;

public class Student {
    private int rollno;
    private String name;
    private String College;
	public Student(int rollno, String name, String college) {
		super();
		this.rollno = rollno;
		this.name = name;
		College = college;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", College=" + College + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
}
