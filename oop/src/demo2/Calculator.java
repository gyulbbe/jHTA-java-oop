package demo2;

public class Calculator {
	/**
	 * 정수를 전달받아서 합계를 반환한다.
	 * @param x 정수값
	 * @param y 정수값
	 * @return 합계
	 */
	int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	/**
	 * 정수를 전달받아서 a를 b로 나눈값을 반환한다.
	 * @param a 정수
	 * @param b 정수
	 * @return 나눗셈 결과
	 */
	double divide(int a, int b) {
		double c = (double)a/b;
		return c;
	}
}