package sec01.Exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setObClickListener(new CallListener());
		btn.touch();
		
		btn.setObClickListener(new MessageListener());
		btn.touch();
		
	}

}
