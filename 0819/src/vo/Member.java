package vo;

public class Member {
	
	private String name;
	private String code;
	private String major;
	private String gender;
	
	
	public Member() {
		
	}//기본생성자 생성
	
	public Member(String name, String major, String code, String gender){
		this.name = name; 
		this.major = major;
		this.code = code;
		this.gender = gender;
		
	}//Member() 생성자 오버로딩
	
	//인자 3개짜리 생성자
	
	public Member(String name, String major, String code) {
//		this.name = name;
//		this.major = major;
//		this.code = code;
//		this.gender = "남자";

		this(name, major, code, "남자");
	}
	
	//인자 2개짜리 생성자
	
	public Member(String name, String major) {
//		this.name = name;
//		this.major = major;
//		this.code = "14학번";
//		this.gender = "남자";
	
		this(name, major,"14학번");
	}
	
	//인자 1개짜리 생성자
	
	public Member(String name) {
//		this.name = name;
//		this.major = "컴공";
//		this.code = "14학번";
//		this.gender = "남자";
		this(name,"컴공");
	}

	
	public void setName (String name) {
		this.name = name;
	}//name setter end
	public String getName () {
		return this.name;
	}//name getter end
	
	public void setCode (String code) {
		this.code = code;
	}//code setter end
	public String getCode () {
		return this.code;
	}//code getter end
	
	public void setMajor (String major) {
		this.major = major;
	}//major setter end
	public String getMajor () {
		return this.major;
	}//major getter end
	
	public void setGender (String gender) {
		this.gender = gender;
	}//gender setter end 
	public String getGender () {
		return this.gender;
	}//gender getter end 
	
	
	
}//Member end 
