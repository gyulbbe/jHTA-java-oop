package demo10;

/*
 * Person 클래스를 상속받아 직원 정보를 표현하는 Employee 클래스다.
 */
public class Employee extends Person{

	/*
	 * Employee는 직원의 소속부서, 급여를 표현하는 멤버변수가 있다.
	 */
	private String dept;
	private int salary;
	
	public Employee() {
		//Person객체의 매개변수 없는 생성자 메소드를 호출한다.
		System.out.println("Employee() 생성자가 실행됩니다.");
	}

	/*
	 * Employee는 직원이름, 나이, 소속부서, 급여를 전달받아서 직원 정보를 초기화하는 생성자가 있다.
	 * - 직원이름, 나이는 Person객체의 멤버변수에 저장하고, 소속부서, 급여는 Employee객체의 멤버변수에 저장한다.
	 * - Employee에서는 부모객체의 생성자 메소드를 호출하는 super() 혹은 super(값, 값)메소드를 실행해서
	 *  자신이 전달받은 직원이름과 나이를 Person객체의 생성자 메소드에 전달해서 Person객체의 name과 age에 저장한다.
	 */
	public Employee(String name, int age, String dept, int salary) {
		//Person객체의 매개변수 있는 생성자 메소드를 호출한다.
		//여기서는 Person(String name, int age)다.
		super(name, age);
		this.dept = dept;
		this.salary = salary;
		System.out.println("Employee(String name, int age, String dept, int salary) 생성자가 실행됩니다.");
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getSalary() {
		return salary;
	}
}