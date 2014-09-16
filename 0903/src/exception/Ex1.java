package exception;

import java.util.Random;

public class Ex1 {
	
	//Exception 예외처리는 try~catch 구문으로 처리합니다.
	//Exception이 발생하는 구문에 적용
	

	
	public static void main(String[] args) {
		
		//System.out.println(5/0); //컴파일 에러는 없다(정수/정수 이므로) 
		
		//자바스크립트 Random 함수 
		//Math.floor(Math.random()*갯수))+시작수
		
		//Java의 난수 발생
		Random ran = new Random();
		//
		//ran.nextInt(갯수)+시작수; 
	
		//5~10까지 난수를 100번 발생
		//0~5까지 난수를 100번 발생
		
		for(int i=0;i<100 ;i++){
			
			int num = ran.nextInt(6)+0;
			
			try {
				//예외발생할만한 코드를 작성
				System.out.println(i+" 번째 "+10/num);
				
			}catch(Exception e) {
				//예외가 발생할때 작동되는 곳
				e.printStackTrace();
			}
		
		} // for end 
		
		
	}//main() end
	
}//Ex1 end 
