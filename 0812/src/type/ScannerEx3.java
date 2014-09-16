package type;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		
		//Scanner객체 선언
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력.");
		
		//int형정수를 얻어오는 메서드
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("첫번째 정수: " + a);
		System.out.println("두번째 정수: " + b);
		
		
	}//main() end
	
}//ScannerEx3 end
