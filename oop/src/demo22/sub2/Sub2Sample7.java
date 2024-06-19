package demo22.sub2;

import demo22.sub1.Sub1Sample2;

public class Sub2Sample7 extends Sub1Sample2{

	public void test() {
//		test1(); <- private
//		test2(); <- default
		test3(); // <- protected
		test4(); // <- public
	}
}