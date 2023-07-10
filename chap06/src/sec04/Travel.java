package sec04;

public class Travel {
	private int oil;
	private String location;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void minusOil(int oil) {
		this.oil -= oil;
	}

	boolean isOilLeft() {
		if (oil <= 0) {
			System.out.println("휘발유가 없어요. 여행 종료하세요.");
			return false;
		} else {
			System.out.println("휘발유가 남았어요. 계속 여행하세요.");
			return true;
		}
	}
}
