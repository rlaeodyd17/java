package test;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요.");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
				
		System.out.println("a + b="+ (a+b));
		System.out.println("a - b="+ (a-b));
		System.out.println("a * b="+ (a*b));
		System.out.println("a / b="+ (a/b));
		
	}//main() end
}//Problem7 end

