package sec01.exam06;

import java.util.*;

public class Student_HashMap {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");

		for (int i = 0; i < student.length; i++) {
			System.out.print(">>");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]);
		}

		Set<String> KeySet = map.keySet();
		Iterator<String> KeyIterator = KeySet.iterator();
		while (KeyIterator.hasNext()) {
			String name = KeyIterator.next();
			System.out.println("-----------------------");
			Student stu = map.get(name);
			System.out.println("이름: " + stu.getName());
			System.out.println("학과: " + stu.getDepartment());
			System.out.println("학번: " + stu.getNumber());
			System.out.println("학점평균: " + stu.getGrade());
			System.out.println("-----------------------");
		}
		
		while(true) {
			System.out.print("학생이름 >> ");
			String name = s.next();
			if(name.equals("그만")) {
				break;
			}
			Student stu = map.get(name);
			stu.find_student(name);
		}
	}
}
