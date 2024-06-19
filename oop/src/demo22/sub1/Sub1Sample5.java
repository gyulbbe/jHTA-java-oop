package demo22.sub1;

public class Sub1Sample5 {

	Sub1Sample2 sample2 = new Sub1Sample2();
	
	public void test() {
//		sample2.test1();// <- private
		sample2.test2();// <- default
		sample2.test3();// <- protected
		sample2.test4();// <- public
	}
}