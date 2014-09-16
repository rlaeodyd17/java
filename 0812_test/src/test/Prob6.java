package test;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//유저에게 출력
		System.out.println("정수 2개를 입력하세요. ^.~//");
		
		//첫번째 정수
		int num1 = scan.nextInt();
		//두번째 정수
		int num2 = scan.nextInt();
		
		//실행결과를 저장하는 boolean형 변수 result를 선언하고 num1과 num2를 비교한 결과를 대입 
		boolean result = num1 > num2;
		
		System.out.println(num1+ ">" +num2+ "=" + result);
	
			
	}//main() end
}//Prob6 end
