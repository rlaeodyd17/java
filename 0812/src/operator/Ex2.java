package operator;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//1)Scanner객체 선언
		
		Scanner scan = new Scanner(System.in);
		
		//2)유저에게 알려줌
		System.out.println("정수 2개 입력");
		
		//3)int형 변수 a를 선언하고 유저에게 숫자 한개 얻어옴
		int a = scan.nextInt();
		
		//4)int형 변수 b를 선언하고 유저에게 숫자 한개 얻어옴
		int b = scan.nextInt();
		
		//5)a와 b의 덧셈결과를 출력
		System.out.println("a+b=" + (a+b));
		
	}//main() end
	
}//Ex2 end

