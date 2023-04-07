package exampleComparable;

import java.time.LocalDateTime;

public class Student {
	private int id;
	private String name;
	private static String  college ="Marwadi University";
	private LocalDateTime dateTime;
	private double Schoolfee;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static String getCollege() {
		return college;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public double getSchoolfee() {
		return Schoolfee;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public void setSchoolfee(double schoolfee) {
		Schoolfee = schoolfee;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateTime=" + dateTime + ", Schoolfee=" + Schoolfee + "]";
	}
	public Student(int id, String name, LocalDateTime dateTime, double schoolfee) {
		super();
		this.id = id;
		this.name = name;
		this.dateTime = dateTime;
		this.Schoolfee = schoolfee;
	}
	
	
	

}
