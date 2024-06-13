package demo10;

public class Person {

	/*
	 * Person객체의 이름과 나이 정보를 표현하는 멤버변수
	 */
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person() 생성자가 실행됩니다.");
	}

	/*
	 * 이름과 나이 정보를 전달받아서 멤버변수를 초기화하는 생성자
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 생성자가 실행됩니다.");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}