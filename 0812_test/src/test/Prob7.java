package test;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		
		//1) 스캐너
		Scanner scan = new Scanner(System.in);
		
		//2) 유저에게 출력
		System.out.println("정수 2개를 입력하세요. ~~ ^^//");
		
		//3) 정수1 입력
		int a = scan.nextInt();
		
		//4) 정수2 입력
		int b = scan.nextInt();
		
		//덧셈
		System.out.println(a+"+"+b+"="+(a+b));
		//뺄셈
		System.out.println(a+"-"+b+"="+(a-b));
		//곱셈
		System.out.println(a+"*"+b+"="+(a*b));
		//나눗셈
		System.out.println(a+"/"+b+"="+(a/b));
		
	}//main() end
}//Prob7 end

