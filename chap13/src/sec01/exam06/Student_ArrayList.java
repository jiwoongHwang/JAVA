package sec01.exam06;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Student_ArrayList {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		for(int i=0;i<student.length;i++) {
			System.out.print(">>");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			list.add(student[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("------------------------");
			Student stu = list.get(i);
			System.out.println("�̸�: " +  stu.getName());
			System.out.println("�а�: " + stu.getDepartment());
			System.out.println("�й�: " + stu.getNumber());
			System.out.println("�������: " + stu.getGrade());
		}
		System.out.println("------------------------");
		
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = s.next();
			if(name.equals("�׸�")) {
				break;
			}
			
			for(int i=0;i<list.size();i++) {
				Student stu = list.get(i);
				stu.find_student(name);
			}
		}
	}

}
