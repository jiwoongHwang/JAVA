package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("검정" , "벤츠" , 3 , "중");
		
		truck.setCost(50000);
		System.out.println(truck.cost);
		
		Car car = truck;	// 자동 타입 변환
		
		car.speedUp(30);	// 부모 메서드 호출
		//car.maxSpeed(50);	 
		//타입이 변환되었기 때문에 자식 메소드 호출 불가능
		
		car.start();
		// 자식 메소드이지만 오버라이딩했기 때문에 호출 가능함
		
	}

}
