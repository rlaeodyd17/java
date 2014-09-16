package control;

import java.util.Scanner;

public class IfEx3_correct {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력하세요~~");
		
		int score = scan.nextInt() ;
	
		//학점을 나타내는 grade변수 선언
		char grade;
		
		//char형 변수 grade를 'F'로 초기화 --> 나중에 학점을 출력할 때, 값을 갱신하게 되며 60점 이하는 자동적으로 F로 표현됨 
		//코드의 간소화!!!
		//코딩의 원칙 : 변하는 것과 변하지 않는 것을 구분한다 !!!!
		grade='F';
		
		if(score>=91) {
			grade = 'A';
		}else if(score >= 81) {
			grade = 'B';
		}else if (score >= 71) {
			grade = 'C';
		}else if (score >= 61) {
			grade = 'D';
		}//if() ~ else if () end 
		System.out.println("당신은" + grade + "학점입니다!");
	}//main() end
}//IfEx3_corret end
