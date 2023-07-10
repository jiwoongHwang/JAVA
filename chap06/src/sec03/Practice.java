package sec03;

public class Practice {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	public Practice(String title, String content) {
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);
	}

	public Practice(String title, String content, String writer) {
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	
	public Practice(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	
	public Practice(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
