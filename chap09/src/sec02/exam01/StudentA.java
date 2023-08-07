package sec02.exam01;

public class StudentA {

	// �͸� ��ü ����
	Person person = new Person() {
		void work() {
			System.out.println("��մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	// ��ø Ŭ����
	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("���� ��ϴ�.");
		}
	}

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}

		};

		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
