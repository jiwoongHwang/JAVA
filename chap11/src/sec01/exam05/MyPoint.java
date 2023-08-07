package sec01.exam05;

public class MyPoint {

	public static void main(String[] args) {
		Point p = new Point(3, 50);
		Point q = new Point(4, 50);
		System.out.println(p);
	
		if (p.equals(q))
			System.out.println("같은 점");
		else 
			System.out.println("다른 점");
		
	}

}
