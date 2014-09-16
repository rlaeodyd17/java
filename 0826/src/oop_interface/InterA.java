package oop_interface;

public interface InterA {

	//자바의 숨겨진 비밀
	//인터페이스 관련
	
	//인터페이스는 추상메서드만 가지기 때문에 abstract 키워드를 생략해도 됩니다. 
	//실력평가 문제!!
	
	//상수는 final로 선언하면 상수 --> 값이 바뀌지 않으므로 은닉화 필요없음
	
	//인터페이스는 상수만 가지기 때문에
	//static final을 생략해도 됩니다.
	
	//public static final int a = 100;
	public int a =100;
	
	
	public void test(); //**** abstract 생략가능 ***
	
}
