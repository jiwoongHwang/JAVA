package sec01.exam05;

public class MyPoint {

	public static void main(String[] args) {
		Point p = new Point(3, 50);
		Point q = new Point(4, 50);
		System.out.println(p);
	
		if (p.equals(q))
			System.out.println("���� ��");
		else 
			System.out.println("�ٸ� ��");
		
	}

}
