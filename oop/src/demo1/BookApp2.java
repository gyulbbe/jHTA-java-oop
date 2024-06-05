package demo1;

import java.util.Arrays;

public class BookApp2 {

	public static void main(String[] args) {
		
		//Book객체의 주소값 3개를 저장하는 배열 객체를 생성한다.
		Book[] books = new Book[3];
		
		//Book객체를 생성하고, book1참조변수에 주소값을 대입한다.
		Book book1 = new Book();
		//book1참조변수로 참조되는 Book객체의 필드에 값을 저장한다.
		book1.title = "이것이 자바다";
		book1.author = "신용근";
		book1.price = 35000;
		
		Book book2 = new Book();
		book2.title = "자바의 정석";
		book2.author = "남궁성";
		book2.price = 30000;
		
		Book book3 = new Book();
		book3.title = "Do it! 점프 투 파이썬";
		book3.author = "박응용";
		book3.price = 25000;
		
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		System.out.println(Arrays.toString(books));
		
		int totalPrice = 0;
		//배열에 저장된 책의 총 가격을 계산하고 출력하기
		for(Book book : books) {
			totalPrice += book.price;
		}
		
		System.out.println(totalPrice);
		
//		for(int i = 0; i < books.length; i++) {
//			System.out.println(books[i].price);
//		}
	}
}