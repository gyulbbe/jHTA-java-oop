package demo18;

public class TextDataReader implements DataReader{

	@Override
	public String read() {
		System.out.println("TextDataReader의 read() 실행됨");
		return "텍스트 회계자료";
	}
}
