package demo4;

import java.util.Date;

public class Post {

	//멤버변수
	private int no;					//번호
	private String title;			//제목
	private String id;				//작성자 아이디
	private String content;			//내용
	private int upCount;			//추천수
	private int reviewCount;		//리뷰갯수
	private double reviewScore;		//리뷰점수
	private boolean isDeleted;		//삭제여부
	private Date createdDate;		//생성일자
	private Date updateDate;		//수정일자
	private Date deleteDate;		//삭제일자
	
	//기본생성자
	public Post() {}
	
	//매개변수 있는 생성자
	public Post(int no, String title, String id, String content) {
		this.no = no;
		this.title = title;
		this.id = id;
		this.content = content;
	}

	public Post(int no, String title, String id, String content, int upCount, int reviewCount, double reviewScore, boolean isDeleted,
			Date createdDate, Date updateDate, Date deleteDate) {
		this.no = no;
		this.title = title;
		this.id = id;
		this.content = content;
		this.setUpCount(upCount);
		this.setReviewCount(reviewCount);
		this.setReviewScore(reviewScore);
		this.isDeleted = isDeleted;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
		this.deleteDate = deleteDate;
	}
	
	//Getter, Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public int getUpCount() {
		return upCount;
	}
	public void setUpCount(int upCount) {
		this.upCount = upCount;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public double getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(double reviewScore) {
		this.reviewScore = reviewScore;
	}
}