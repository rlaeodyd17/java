package control;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		//스캐너
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력하세요~~");
		
		int score = scan.nextInt() ;
		
		
		//다중 if문
		//if() ~ else if() ......else
		
		if(score>=91){
			System.out.println("당신은 A학점입니다.");
			
		}else if(score>=81){
			System.out.println("당신은 B학점입니다.");

		}else if(score>=71){
			System.out.println("당신은 C학점입니다.");

		}else if(score>=61){
			System.out.println("당신은 D학점입니다.");

		}else if(score<=60){
			System.out.println("당신은 F학점입니다.");

		}//if() ~ else if() end
				
		//학생의 점수를 입력받아서
		//91~100점이면 '당신은 A학점입니다.'
		//81~90점이면 B
		//71~80점이면 C
		//61~70점이면 D
		//60점이하면 F
		
	}//main() end
}//IfEx3 end

