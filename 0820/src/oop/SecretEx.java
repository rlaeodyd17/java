package oop;

//자바의 숨겨진 비밀
//1) import관련
//java.lang패키지 안에 있는 클래스들을 사용할 때, import를 생략할 수 있다.
import java.lang.*;

public class SecretEx {

	//2) 생성자 관련
	//프로그래머가 생성자를 단 하나라도 선언하지 않으면, 컴파일러 컴파일시 "기본생성자"를 만들어 준다.
	public SecretEx(){
		
		//4) 같은 클래스 내부에서 인스턴스 멤버 접근시 "this." 생략할 수 있다.
		this.b = 10;
		
	}
	
	static int a;
	
	private int b;
	
	public static void main(String[] args) {
	
		//3) 스태틱멤버필드 관련
		//같은 클래스내부에서 멤버들간에 접근시 "클래스명."을 생략 할 수 있다.
		SecretEx.a = 10;
		
		SecretEx e = new SecretEx();
		
	}//main() end 
	
}//SecretEx end 
