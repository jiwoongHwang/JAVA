package sec01.Exam06;

public class Button {
	OnClickListener listener;

	void setObClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {
		void onClick();
	}
}
