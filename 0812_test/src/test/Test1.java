package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int i = scan.nextInt();
		
		String result = i>= 90? "합격" : "불합격";
		
		System.out.println(result);
		
	}//main() end
	
	
}//Test1 end
