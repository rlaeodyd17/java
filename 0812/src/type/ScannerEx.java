package type;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//우리가 콘솔에 입력하는 글자를 스캔하는 놈(객체) 예제(--> 사용법)
		
		//콘솔에 입력하는 글자를 얻어오는 스캐너
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");	
		
		//콘솔에 우리가 입력하는 한줄의 글자를 얻어옵니다.
		
		String name = scan.nextLine();
		
		System.out.println("당신이 입력한 이름: " + name);
	
		
	}

}
