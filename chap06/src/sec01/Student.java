package sec01;

public class Student {
		int age;	//����
		String gender;	//����
		String name;	//�̸�
		
		public Student() {	//Student�� ������, ��ü ������ �ʱ�ȭ
		}
			
		public int getAge() {
			return age;
		}
		
		public String getGender() {
			return gender;
		}



		public void setGender(String gender) {
			this.gender = gender;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}






		public int setAge(int age) {	//�޼ҵ�
			return age;
		}

}
