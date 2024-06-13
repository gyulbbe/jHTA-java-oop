package demo11;

public class ColorPrinter extends Printer{

//	public void printColor() {
//		System.out.println("컬러로 인쇄한다.");
//	}
	
	/*
	 * 메소드 재정의(Method Override)
	 * - 부모 혹은 조상 클래스로부터 상속받는 메소드를 자식 클래스에서 그대로 사용하지 않고, 자식 클래스에서 자신에게 맞게 구현내용을 다시 정의하는 것이다.
	 */
	@Override //어노테이션(부가적인 설명)
	public void print() {
		System.out.println("컬러로 인쇄한다.");
	}
}