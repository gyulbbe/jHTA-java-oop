package demo4;

public class User {

	private String id;
	private String password;
	private String name;
	private String email;
	private String tel;
	private int age;
	private boolean isEnabled;
	
	//기본 생성자
	public User() {}
	
	//매개변수 있는 생성자
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public User(String id, String password, String name, String email, String tel) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.tel = tel;
	}
	
	public User(String id, String password, String name, String email, String tel, int age, boolean isEnabled) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.age = age;
		this.isEnabled = isEnabled;
	}
	
	//Getter 메소드
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTel() {
		return tel;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}
	
	//Setter 메소드
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
}