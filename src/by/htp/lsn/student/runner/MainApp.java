package by.htp.lsn.student.runner;

import by.htp.lsn.student.model.Group;
import by.htp.lsn.student.model.Student;

public class MainApp {

	public static void main(String[] args) {
		Student student1 = new Student("Name1", "Surname1", 19, 2015);
		Student student2 = new Student("Name2", "Surname2", 20, 2016);
		Student student3 = new Student("Name3", "Surname3", 20, 2017);
		Student student4 = new Student("Name4", "Surname4", 18, 2016);
		Student student5 = new Student("Name5", "Surname5", 17, 2015);
		Student student6 = new Student("Name6", "Surname6", 19, 2015);
		Student student7 = new Student("Name7", "Surname7", 20, 2017);
		Student student8 = new Student("Name8", "Surname8", 18, 2015);
		Student student9 = new Student("Name9", "Surname9", 19, 2018);
		
		Group group = new Group();
		
		if(group.getStudents() == null){
			System.out.println("null");
		} else {
			System.out.println("not null");
		}
		
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		group.addStudent(student9);
		
		
		group.averageAge();
		
		group.countStudents2015Year();
		
		group.maxStudentsCountYear();
		
		group.printStudents();
		
		group.quickSort();
		
		group.bubbleSortAge();
		
		

	}

}
