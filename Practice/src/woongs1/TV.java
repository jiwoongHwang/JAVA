package woongs1;

public class TV {
	private String brand;
	private int year;
	private int size;

	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}

	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("삼성",2023,55);
		myTv.show();
	}

}
