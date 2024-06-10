package demo4;

public class UserApp2 {

	public static void main(String[] args) {

		//User객체의 다양한 생성자 메소드를 호출해서 객체 초기화
		
		//기본 생성자 메소드를 사용해서 객체 초기화
		User user1 = new User();
		
		//매개변수 있는 생성자 메소드를 사용해서 객체 초기화
		User user2 = new User("hong", "zxcv1234", "홍길동");
		User user3 = new User("kim", "zxcv1234",
				"김유신", "kim@naver.com", "010-1111-1111");
		User user4 = new User("kang", "zxcv1234",
				"강감찬", "kang@naver.com", "010-2222-2222", 50, true);
	}
}