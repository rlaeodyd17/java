package test;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	
	Scanner scan;
		
	scan = new Scanner(System.in);

	//시작숫자 num1, 끝 숫자 num2 선언 
	int num1,num2;

	//시작숫자 입력	
	System.out.println("시작숫자를 입력하세요.");

	num1 = scan.nextInt();

	//끝 숫자 입력
	System.out.println("끝 숫자를 입력하세요.(시작숫자보다 큰숫자로용^^)");
	
	num2 = scan.nextInt();
	
	//시작숫자와 끝숫자를 입력받아 반복하여 출력
	for (int i=num1; i<=num2; i++) {
		System.out.println(i);
		
	}//for end
	scan.close();
	}//main() end
	
}//Ex3 end
