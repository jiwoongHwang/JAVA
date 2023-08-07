package sec03.exam01;

public class SmartPhone extends Phone {
	int cost;

	public SmartPhone(String owner, int cost) {
		super(owner);
		this.cost = cost;
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
