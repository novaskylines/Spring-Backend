package board.dto;

import java.util.Date;

public class BoardDTO {

	private int num;
	private String title;
	private String content;
	private String id;
	private int visitcount;
	private java.util.Date postdate;
	
	public BoardDTO() {}

	public BoardDTO(int num, String title, String content, String id, int visitcount, Date postdate) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.id = id;
		this.visitcount = visitcount;
		this.postdate = postdate;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVisitcount() {
		return visitcount;
	}

	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}

	public java.util.Date getPostdate() {
		return postdate;
	}

	public void setPostdate(java.util.Date postdate) {
		this.postdate = postdate;
	}
	
	
}
