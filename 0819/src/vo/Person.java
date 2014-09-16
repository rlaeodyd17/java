package vo;

// vo: Value Object 멤버필드만 갖고 있는 object ! 

public class Person {
	// 수강생 여러분들의 정보(값)를 저장하는 객체의 설계도
	
	// 만약 외부에서 멤버필드에 직접 접근이 가능하다면 잘못된 값이 저장될 수 도 있고 위험합니다.
	
	// 은닉화란 멤버필드를 private로 선언하여 외부에서 직접 접근을 막는 방법!
	
	// 외부에서는 멤버필드에 메서드를 이용해서 간접 접근이 가능 !!
	
	private String name;
	private int age;
	private int height;
	private String phone;
	private String address;
	private String hobby;

	// 멤버필드에 값을 외부에서 세팅해 주는 setter메서드(리턴자료형은 무조건 void)
	// 멤버필드의 값을 얻어가는 getter메서드 

	
	// *****클래스 내부에서 인스턴스의 경우 "(아직 객체가 만들어 지지 않았기 때문에)this."으로 접근할 수 있다.**** 
	
	public void setName(String name) {
		
		//heap안의 멤버들은 접근시 "레퍼런스." 으로 접근
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setAddress(String adress) {
		this.address = adress;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHobby() {
		return this.hobby;
	}
}//Person end

