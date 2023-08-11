package sec02.exam06;

import java.io.Serializable;
import java.util.Date;

import javax.xml.crypto.Data;

public class Board implements Serializable {
	private int bno;			// 게시판 번호
	private String title;		// 제목
	private String content;		// 내용
	private String writer;		// 글쓴이
	private Date date;			// 작성날짜

	public Board(int bno, String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}

