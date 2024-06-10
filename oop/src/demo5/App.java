package demo5;

import utils.Keyboard;

public class App {

	public static void main(String[] args) {
		
		//키보드로 입력한 값을 읽어오기
		
		//문자열 읽어오기
//		System.out.println("이름을 입력하세요.");
//		String name = Keyboard.readString();
//		System.out.println("입력: " + name);
		
		//정수 읽어오기
//		System.out.println("출생년도를 입력하세요.");
//		int birthYear = Keyboard.readInt();
//		int age = 2024 - birthYear;
//		System.out.println("나이: " + age);
		
		//실수 읽어오기
		System.out.println("몸무게를 입력하세요.(m)");
		double weight = Keyboard.readDouble();
		System.out.println("몸무게: " + weight);
		
		System.out.println("키를 입력하세요.(kg)");
		double height = Keyboard.readDouble();
		System.out.println("키: " + height);
		
		double bmi = weight/Math.pow(height, 2);
		System.out.println("bmi지수: " + bmi);
		
		if(bmi <= 18.5) {
			System.out.println("저체중입니다.");
		} else if(bmi <= 23) {
			System.out.println("평균입니다.");
		} else if(bmi <= 25) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("비만입니다.");
		}
	}
}