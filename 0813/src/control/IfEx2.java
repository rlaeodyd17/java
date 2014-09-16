package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		
		//나이를 입력받아서 19이상이면
		
		//당신은 성인입니다. 라고 출력
		
		//19미만이면 당신은 성인이 아닙니다. 라고 출력
				
		Scanner scan = new Scanner(System.in);
				
		System.out.println("당신의 만 나이를 숫자로 입력하세요~~");
		
		int	age = scan.nextInt();
		
		if (age>=19) {
			//성인일때
			System.out.println("당신은 성인입니다. ^^;;");
		}else {
			//성인이 아닐때
			System.out.println("당신은 미성년자 입니다 ~~ ^^ ");
		} // if~else end
		
	}//main() end
	
}//IfEx2 end
