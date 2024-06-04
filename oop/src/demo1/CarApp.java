package demo1;

public class CarApp {

	public static void main(String[] args) {
		/*
		 * 객체 생성하기
		 * 
		 * 클래스명 참조변수 = new 클래스명();
		 * 	1. 클래스명에 해당하는 설계도를 메모리에 로딩한다.
		 * 	2. 설계도를 이용해서 메모리의 Heap 영역에 객체를 생성한다.
		 * 		* Heap 영역은 객체가 생성되는 영역이다.
		 * 		* Heap 영역은 가비지 콜렉터의 관리대상 영역이다.
		 * 	3. 생성된 객체의 주소값(참조값)을 반환한다.
		 * 	4. 참조변수를 생성하고, 참조변수에 생성된 객체의 주소값이 대입된다.
		 * 	5. 참조변수는 참조값에 해당하는 객체를 참조한다.
		 */
		
		//Car클래스로 Car객체로 생성하고, 참조변수 car에 객체의 주소값이 대입된다.
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		//car1과 같은 객체를 바라보기 때문에 객체에 대한 정보가 같다.
		Car car4 = car1;
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
	}
}