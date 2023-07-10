package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {
		Car car1 = new Car(); // 기본 생성자 호출

		Car car2 = new Car("테슬라3", "빨간색" , 350); // 사용자 정의 생성자 호출

		System.out.println("모델명 : " + car2.model);
		System.out.println("색깔 : " + car2.color);
		System.out.println("최고 속도 : " + car2.maxSpeed);
	}

}
