package test;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
	
		//객체자료형 Scanner형(Scanner클래스를 가지고 만들어진 객체의 레퍼런스를 담을 수 있는) 변수 scan을 선언하고
		Scanner scan;
		
		//new라는 키워드를 통해서 heap메모리공간의 영역을 할당받고
		//Scanner()생성자를 호출하여 
		//Scanner객체를 생성후 레퍼런스를 scan변수에 대입
		
		scan= new Scanner(System.in);
		
		//유저에게 점수를 입력하세요라고 출력
		System.out.println("점수를 입력하세요. ^___^//");
		
		//유저에게 정수를 입력받아서 score변수에게 대입
		int score;
		
		score = scan.nextInt();
		
		//System.out.println(score);
		
		//3항연산자
		// 조건식 ? 데이터1 : 데이터2;
		
		//String형 변수 result를 선언하고 score가 90 이상이면 합격을 미만이면 불합격의 데이터를 대입
		String result = score>= 90? "합격" : "불합격";
		
		//유저에게 result를 출력
		System.out.println(result);
		
	}//main() end
	
	
}//Prob5 end
