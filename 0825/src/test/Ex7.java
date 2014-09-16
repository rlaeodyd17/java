package test;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//크기가 3인 String배열을 선언하고 생성합니다.
		String[] names = new String[3];
		
		//Scanner 객체
		Scanner scan = new Scanner(System.in);
		
		//친구이름을 3번 반복하여 입력을 받고 
		//그 이름을 배열의 0,1,2 번지에 각각 저장합니다.
		//반복문을 이용해서 names배열의 0,1,2번지에 유저가 입력한 이름 3개를 대입
		
		
		for(int i=0; i < names.length; i++) {
			System.out.println("이름을 입력하세요~"); 
			names[i] = scan.nextLine();
		}//for end

		
		//이름 출력
		//친구들의 이름은 XXX,YYY,ZZZ 입니다.
		System.out.println("친구들의 이름은 "+names[0]+","+names[1]+","+names[2]+"입니다.");
	scan.close();
		for(String name : names) {
			System.out.println(name);
		}
	
	}//main() end
}//Ex7 end
