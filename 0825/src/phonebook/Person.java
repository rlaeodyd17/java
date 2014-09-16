package phonebook;

//Person VO 생성 --> private, setter/getter, 기본생성자, 멤버필드에 맞는 인자생성자, "toString 오버라이딩"까지 필수적으로 setup해서 사용하도록 한다!!! 
public class Person {

	//이름(name)
	private String name;
	//전화번호(phone)
	private String phone;
	//주소(address)
	private String address;

	//Object에서 상속받은  toString()을 오버라이딩 해 봅시다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: "+this.name+" /주소: "+this.address+" /전화번호: "+this.phone;
	}
	
	
	//기본 생성자
	public Person() {
	}
	
	//인자 3개짜리 생성자
	public Person(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
