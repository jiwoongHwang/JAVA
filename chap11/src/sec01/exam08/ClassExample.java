package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		
//		Class clazz = Key.class;
		
//		Class clazz = Class.forName("sec01.exam08.Key");
	
		Key key = new Key(50);
		Class clazz = key.getClass();
		
		System.out.println(clazz.getName());
		
		Class clazz2 = Member.class;
		System.out.println(clazz2.getSimpleName());
	}

}
