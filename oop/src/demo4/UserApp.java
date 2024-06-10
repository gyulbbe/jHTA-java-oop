package demo4;

public class UserApp {

	public static void main(String[] args) {
		//회원 정보를 표현하는 User객체 생성하기
		User user1 = new User();
		
		//생성한 User객체의 멤버변수에 회원정보 저장하기
		//Setter 메소드를 실행해서 객체의 멤버변수에 값 대입하기
		user1.setId("hong");
		user1.setPassword("zxcv1234");
		user1.setName("홍길동");
		user1.setEmail("hong@gmail.com");
		user1.setTel("010-1111-1111");
		user1.setAge(30);
		user1.setEnabled(true);
		
		//Getter 메소드를 실행해서 객체의 멤버변수 값 조회하기
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPassword());
		System.out.println("이름: " + user1.getName());
		System.out.println("이메일: " + user1.getEmail());
		System.out.println("전화번호: " + user1.getTel());
		System.out.println("나이: " + user1.getAge());
		System.out.println("사용여부: " + user1.isEnabled());
	}
}