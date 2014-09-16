package test;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
		
			System.out.println("'끝'이라고 입력하면 종료됩니다.");
			String str = scan.nextLine();
			
			//만약 변수 str값이 끝과 같다면 이 반복문을 벗어남
			
			if(str.equals("끝")) {
				break;
			} else {
			  System.out.println("당신이 입력한 글자는"+str+ "/ 종료가 안되네요");
				
			}// if~else end 
		}//while end
		
		System.out.println("끝이라고 입력하세셨네요~~^^ 종료!");
		
		scan.close();
	}//main() end
}//Ex5 end
