package oop;

//자바의 숨겨진 비밀
// java.lang 패키지에 있는 클래스들은 import를 생략할 수 있습니다.
import java.lang.*;

import vo.Car;

public class Ex1 {

	
	public static void main(String[] args) {
		
		Ex1 e = new Ex1();
		Ex1 e2 = new Ex1();
		e2 = e;
		
		int a = 6;
		int b = 5;
		
		System.out.println(a==b);
		//일반변수 끼리의 항등연산은 할 수 없다
		
		System.out.println(e2==e);
		//객체끼리의 항등연산은 레퍼런스 비교이므로 할 수 있다.
		
		//일반적인 객체(String 등 제외)는 equals()메서드와 '=='가 같다.
		
		
		String name = "김대용"; 
		String hi = new String ("Hello"); //****"Hello"는 String형 클래스의 암시적 객체생성****
		
		//객체자료형 "String"  = <"김대용";> 기본자료형처럼 값을 대입하는 것? "String"은 기본 개념과 다르다......
		//(String, Wrapper클래스)는 암시적 객체생성법으로 작성
	
		
	}
}//Ex1 end
