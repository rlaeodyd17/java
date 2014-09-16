package vo;

public class TV {
	
	private String company;
	private String model;
	private String price;
	
	//public TV() { 
	//	
	//} // TV()클래스의 기본 생성자 --> 프로그래머가 기본생성자를 만들어주지 않으면!!, 컴파일러가 자동적으로 기본생성자를 만든다!!
	
	public TV() {
		
	} //코딩시 기본생성자도 반드시 선언하는 습관을 기른다!!
	
	public TV(String company, String model, String price) {
		this.company = company;
		this.model = model;
		this.price = price;
		
	} // int i가 인자인 TV()클래스 생성자 --> (생성자 오버로딩 위의 것과 비교시)
	
	public void setCompany (String company) {
		this.company = company;
	}

	public String getCompany () {
		return this.company;
	}
	
	public void setModel (String model) {
		this.model = model;
	}

	public String getModel () {
		return this.model;
	}
	
	public void setPrice (String price) {
		this.price = price;
	}
	
	public String getPrice () {
		return this.price;
	}
	
}//TV end 
