package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();
			
			myCar.setGas(5);
			System.out.println("가스가 5만큼 충전되었습니다");
			
			boolean gasState = myCar.isLeftGas();
			if(gasState) {
				System.out.println("출발합니다.");
				myCar.run();
			}
			
			if(myCar.isLeftGas()) {
				System.out.println("가스를 주입할 필요가 없습니다.");
			} else {
				System.out.println("gas를 주입하세요.");
			}
	}

}
