package sec01.Exam05;

class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
		
		//	Nested�� ���� Ŭ�����϶� ȣ��
		//	Outter.Nested nested = new Outter.Nested();
	
	}

}
