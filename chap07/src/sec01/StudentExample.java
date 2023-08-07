package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student(1234 , 180 , "ㅇㅇ");
		System.out.println("몸무게 : " + st.weight);
		System.out.println("키 : " + st.height);
		System.out.println("학과 : " + st.studentDept);
		
		String result = st.eat("피자");
		System.out.println(result);
		
		st.sleep();
		st.awake();
		System.out.println(st.eat("피자"));
		
		st.study("카페");
		st.dressOn();
		
	}

}
