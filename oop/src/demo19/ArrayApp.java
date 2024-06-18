package demo19;

public class ArrayApp {

	public static void main(String[] args) {
		
		ArraySampleOuter outer = new ArraySampleOuter();
		outer.add("홍길동");
		outer.add("김유신");
		
		InnerIterator it = outer.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
	}
}