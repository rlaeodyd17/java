package constructor;

//import 관련
//java.lang package import 생략 가능


public class Ex1 {

	
	//프로그래머가 단 한개라도 생성자를 선어하지 않으면 컴파일러가 컴파일시 만들어 줌
	
	public Ex1() {
		System.out.println("기본생성자");
	}

	public Ex1(char c) {
		this();
		System.out.println("인자 1개 생성자");
	}
	
	public static void main(String[] args) {
	
		new Ex1('a');
		       
}	
	

}
