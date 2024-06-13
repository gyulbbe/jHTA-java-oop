package demo10;

public class App {

	public static void main(String[] args) {

		//Person객체 생성하고 초기화하기
		//이름과 나이를 전달받아서 초기화하는 생성자를 호출한다.
		Person person = new Person("홍길동", 30);
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}