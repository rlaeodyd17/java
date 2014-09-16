package test;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//1)Scanner클래스를 가지고 만들어진 객체의 레퍼런스를 담을 수 있 변수 scan을 선언
		Scanner scan;
						
		//2)new라는 키워드를 통해서 heap메모리공간의 영역을 할당받고
		//Scanner()생성자를 호출하여 Scanner객체를 생성 후 레퍼런스를 
		//scan변수에 대입
		scan = new Scanner(System.in);
						
		//3)유저에게 좋아하는 색상을 입력하세요라고 출력
		System.out.println("좋아하는 색상은?");
		
		//4)유저에게 문자열(색상)을 입력받고 
		String color;
		color = scan.nextLine();
		//5)입력된 문자열(색상)을 출력
		System.out.println("당신은 " +color+ "색을 좋아하네요.~~ ^__^//");
		scan.close();
		
	}//main() end
	
}//Ex2 end
