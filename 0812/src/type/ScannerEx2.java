package type;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main (String[] args) {
	
		//Scanner객체(객체자료형 or 클래스형 Scanner)를 담는 scan변수 선언하고 Scanner객체를 생성 후 대입
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 ^^");
		
		//콘솔에서 문자열 한 줄을 얻어오는 방법 호출
		
		String str = scan.nextLine();
		
		System.out.println("안녕하세요 ~~~" + str + "님" + "   " + "사랑해용 ^__^//");
		
	}//main() end
	
}//ScannerEx2 end
