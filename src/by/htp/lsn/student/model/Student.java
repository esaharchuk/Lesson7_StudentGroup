package by.htp.lsn.student.model;

public class Student {

	String name;
	String surname;
	int age;
	int yearOfReceipt;

	public Student() {

	}

	public Student(String name, String surname, int age, int yearOfReceipt) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.yearOfReceipt = yearOfReceipt;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setyearOfReceipt(int yearOfReceipt) {
		this.yearOfReceipt = yearOfReceipt;
	}

	public int getyearOfReceipt() {
		return yearOfReceipt;
	}

}
