package demo1;

/**
 * Book 클래스는 도서 정보를 표현하는 객체를 생성할 때 사용하는 설계도다.
 */
public class Book {
	
	/**
	 * 제목
	 */
	String title;
	
	/**
	 * 작가
	 */
	String author;
	
	/**
	 * 출판사
	 */
	String publisher;
	
	/**
	 * 가격
	 */
	int price;
	
	/**
	 * 할인율
	 */
	double discountRate;
	
	/**
	 * 판매완료 여부
	 */
	boolean soldout;

	@Override
	public String toString() {
		return "Book [title= " + title + ", author= " + author + ", publisher= " + publisher + ", price= " + price
				+ ", discountRate= " + discountRate + ", soldout= " + soldout + "]";
	}
}