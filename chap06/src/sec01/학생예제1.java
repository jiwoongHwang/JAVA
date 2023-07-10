package sec01;

public class 학생예제1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
//		s1.age;
//		s1.setAge(40);
		
		if (s1 == s2) {
			System.out.println("같은 참조");

		} else {
			System.out.println("다른 참조");
		}
	}

}
