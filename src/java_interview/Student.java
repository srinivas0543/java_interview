package java_interview;

import java.util.*;

public class Student {
	
	public Student(int id, String firstName, int age, String gender, String dept, String city, int rank,
			List<String> contacts, int marks) {
		super();
		Id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
		this.marks = marks;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", age=" + age + ", gender=" + gender + ", dept="
				+ dept + ", city=" + city + ", marks=" + marks + " rank=" + rank + ", contacts=" + contacts + "]";
	}
	
	
	private int Id;
	private String firstName;
	private int age;
	private String gender;
	private String dept;
	private String city;
	private int rank;
	private List<String> contacts;
	private int marks;
	

}
