package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student(1234 , 180 , "����");
		System.out.println("������ : " + st.weight);
		System.out.println("Ű : " + st.height);
		System.out.println("�а� : " + st.studentDept);
		
		String result = st.eat("����");
		System.out.println(result);
		
		st.sleep();
		st.awake();
		System.out.println(st.eat("����"));
		
		st.study("ī��");
		st.dressOn();
		
	}

}
