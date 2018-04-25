package by.htp.lsn.student.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private String groupTitle;
	private Student[] students;
	private int quantity;
	double averageAge;

	public Group() {

	}

	public Group(String groupTitle, int quantity) {
		this.groupTitle = groupTitle;
		this.quantity = quantity;
	}

	public void setStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void setgroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public String groupTitle() {
		return this.groupTitle;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public int getquantity() {
		return this.quantity;
	}

	// добавление студентов
	public void addStudent(Student student) {

		if (this.students != null) {
			if (quantity < students.length) {
				students[quantity] = student;
				quantity++;
			} else {
				Student[] students = new Student[this.students.length + 15];

				for (int i = 0; i < this.students.length; i++) {
					students[i] = this.students[i];
				}
				this.students = students;
				this.students[quantity] = student;
				quantity++;
			}
		} else {
			this.students = new Student[1];
			this.students[quantity] = student;
			quantity++;
		}

	}
	// средний возраст

	public double averageAge() {
		double average = 0;
		int sumAge = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			sumAge = sumAge + students[i].getAge();
		}
		average = (double) sumAge / quantity;
		return average;
	}
	// количество студентов поступивших в 2015

	public int countStudents2015Year() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			if (students[i].getyearOfReceipt() == 2015) {
				count++;
			}
		}
		return count;
	}

	// год поступления максимального кол-ва студентов

	public void maxStudentsCountYear() {
		int count = 0;
		int year = 0;
		if (students != null) {
			for (int i = 0; i < students.length; i++) {
				for (int j = i; j < students.length; j++) {
					if (students[i].yearOfReceipt == students[j].yearOfReceipt) {
						count++;
						year = students[i].yearOfReceipt;
					}
				}
			}
			System.out.println("Max students count year: " + year);
			System.out.println("Students: " + count);
		}
	}
	// рачпечатать список студентов

	public void printStudents() {

		SimpleDateFormat yearOfReceipt = new SimpleDateFormat("yyyy");

		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				int n = i + 1;
				System.out.println("Student #" + n + " " + this.students[i].name + " " + this.students[i].surname
						+ " BirthDate:" + " JoinDate:" + yearOfReceipt.format(this.students[i].yearOfReceipt) + " Age:"
						+ this.students[i].age);
			}

		}

	}

	// СОРТИРОВКИ

	// быстравя сортировка

	public void quickSort() {
		Arrays.sort(students, new Comparator<Student>() {

			public int compare(Student q, Student w) {
				if (q == null) {
					return 1;
				} else if (w == null) {
					return -1;
				} else {
					return q.age - w.age;
				}
			}
		});
	}

	// сортировка пузырьком

	public void bubbleSortAge() {
		for (int i = this.students.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (this.students[j + 1] != null)
					if (this.students[j].age > this.students[j + 1].age) {
						Student tmp = this.students[j];
						this.students[j] = this.students[j + 1];
						this.students[j + 1] = tmp;
					}

			}

		}

	}

}
