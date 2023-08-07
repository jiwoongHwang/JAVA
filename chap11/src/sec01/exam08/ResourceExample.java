package sec01.exam08;

public class ResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1 = clazz.getResource("bear.jpg").getPath();
		String photo2 = clazz.getResource("images/flog.JPG").getPath();
		
		System.out.println(photo1);
		System.out.println(photo2);
	}

}
