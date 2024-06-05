package demo2;

public class CalculatorApp {

	public static void main(String[] args) {
		
//		Sample sample = new Sample();
		Calculator calculator = new Calculator();
		
		int x = calculator.plus(10, 30);
		System.out.println("반환받은 값: " + x);
		
		int y = calculator.plus(103005, 18383828);
		System.out.println("반환받은 값: " + y);
		
		double result1 = calculator.divide(10, 30);
		System.out.println("반환받은 값: " + result1);
		
		System.out.println(calculator.divide(10, 5));
//		System.out.println(sample.test1());		//컴파일 오류
//		System.out.println(sample.test2(x));	//컴파일 오류
//		System.out.println(sample.test3(x, y));	//컴파일 오류
		//반환하는 값이 없기 때문에 출력에 이용할 수 없다.
	}
}