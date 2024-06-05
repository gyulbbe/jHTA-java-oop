package demo1;

public class BookApp {

	public static void main(String[] args) {
		
		Book book1 = new Book();
//		Book book2 = new Book();
		
		book1.title = "자바의 정석 기초편";
		book1.author = "남궁성";
		book1.publisher = "도우출판사";
		book1.price = 30000;
		book1.discountRate = 0.15;
		book1.soldout = false;
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.discountRate);
		System.out.println(book1.price);
		System.out.println(book1.publisher);
		System.out.println(book1.soldout);
	}
}