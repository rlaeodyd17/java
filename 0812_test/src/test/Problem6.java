package test;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요.");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String result = a>b? "true": "false";
		
		System.out.println(result);
		
	}//main() end
}//Problem6 end
