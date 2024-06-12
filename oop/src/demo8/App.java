package demo8;

public class App {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		GrandChild3 c3 = new GrandChild3();
		
		p.a = 10;	//Parent 클래스에 정의되어 있다.
		p.b = 20;	//Parent 클래스에 정의되어 있다.
		p.test1();	//Parent 클래스에 정의되어 있다.
		
		c1.a = 100;	//Parent 클래스에 정의되어 있다.
		c1.b = 200;	//Parent 클래스에 정의되어 있다.
		c1.test1();	//Parent 클래스에 정의되어 있다.
		c1.x = 300;	//Child1 클래스에 정의되어 있다.
		c1.y = 400;	//Child1 클래스에 정의되어 있다.
		c1.test2();	//Child1 클래스에 정의되어 있다.
		
		c2.a = 1000;	//Parent 클래스에 정의되어 있다.
		c2.b = 2000;	//Parent 클래스에 정의되어 있다.
		c2.test1();		//Parent 클래스에 정의되어 있다.
		c2.k = 3000;	//Child2 클래스에 정의되어 있다.
		c2.j = 4000;	//Child2 클래스에 정의되어 있다.
		c2.test3();		//Child2 클래스에 정의되어 있다.
		
		c3.a = 1;	//Parent 클래스에 정의되어 있다.
		c3.b = 2;	//Parent 클래스에 정의되어 있다.
		c3.x = 5;	//Child1 클래스에 정의되어 있다.
		c3.y = 6;	//Child1 클래스에 정의되어 있다.
		c3.m = 3;	//GrandChild3 클래스에 정의되어 있다.
		c3.n = 4;	//GrandChild3 클래스에 정의되어 있다.
		c3.test1();	//Parent 클래스에 정의되어 있다.
		c3.test2();	//Child1 클래스에 정의되어 있다.
		c3.test4();	//GrandChild3 클래스에 정의되어 있다.
	}
}