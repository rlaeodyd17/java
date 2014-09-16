package test;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan;
		
		scan = new Scanner(System.in);
			
		System.out.println("당신의 이메일을 입력하세요.~~^__^//");
		
		System.out.println("예) kimpilgu@gmail.com");
		
		//유저의 이메일을 문자열로 입력 받는다.
		String email;
		
		email = scan.nextLine();
		
		//결과적으로는 substring(int beginIndex, int endIndex)메서드 이용
		
		//시작인덱스는 0으로 알고 있으므로, 끝인덱스를 알아오기 위해서 @의 인덱스를 알아내는 메서드 indexOf()를 이용한다!!!
		
		
		//System.out.println(email); 
		//email.indexOf(@)
		//System.out.println(email.indexOf("@"));	
		
		//이메일에서 ID의 시작(beginIndex, 0)과 끝(endIndex, @)를 substring을 이용하여 추출  
		System.out.println("당신의 ID는  " +email.substring(0,email.indexOf("@"))+ "입니다.");
		scan.close();
	}//main() end
	
}//Ex4 end
