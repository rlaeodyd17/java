package test;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	
	//배열의 크기가 될 숫자를 하나 입력받습니다.
	Scanner scan = new Scanner(System.in);
	
	System.out.println("사람 수를 입력하세요 ^.~");
	
	int length;
			
	length = scan.nextInt();
	scan.nextLine(); // 숫자,엔터에서 엔터를 처리
	//입력받은 숫자로 String배열을 생성
	
	System.out.println("이름 입력");
	
	
	String[] names = new String[length];
	
	for(int i=0; i < names.length; i++) {
		 names[i] = scan.nextLine();
	//	System.out.println(names[i]);
	}
		
	//이름 출력
	//친구들의 이름은 XXX,YYY,ZZZ 입니다.
	
	for(String name: names) {
		System.out.println("친구들의 이름은 "+ name + " 입니다.");
	}//for end
	scan.close();
	
	}//main() end
}//Ex8 end
