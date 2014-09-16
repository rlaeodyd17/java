package control;

import java.util.Scanner;

public class BreakEx {

	
	public static void main(String[] args) {
		
		//비밀번호가 124
		
		Scanner scan = new Scanner (System.in);
		
		while(true){
			
			System.out.println("비밀번호를 입력하세요~ ^^");
			int pwd = scan.nextInt();
			
			//만약 변수 pwd값이 1234와 같다면 이 반복문을 벗어나야 합니다.
			
			if( pwd == 1234) {
				break;
			} //if end
		}//while end
		
		System.out.println("환영합니다~~!!");
		
		scan.close(); //Input, Output 관련 호출한 객체 반환! 
	}//main() end
	
}//BreakEx end
