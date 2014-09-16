package operator;

public class Ex5 {

	public static void main(String[] args) {
		
		//논리연산자
		// && : 논리곱(피연산자 둘다 true일때만 true)
		//    ~ 이고
		
		// || : 논리합(피연산자 중에 true가 하나라도 있으면 true)
		//	  ~ 이거나
		
		
		//논리연산자와 비트연산자의 차이
		//논리값에 대해서는 의미는 같습니다.
		
		//다만, 논리연산자는 앞의 결과에 따라 뒤쪽이 연산하지 않습니다.
		
		//예) ||  앞이 true면 뒤 연산 X (완전 중요함)
		//    &&  앞이 false면 뒤 연산 X
		
		//비트는 둘다 무조건 연산후 연산합니다.
		boolean result = 5 > 3 && 10 < 5 ;
		
		System.out.println(result);
		
		System.out.println("===================");
		
		result = 5>3 || 10<5;
		
		System.out.println(result);
		
		
		//비트연산자
		// & / |
		
		
		//삼항연산자
		
		// 조건식 ? 자료1 : 자료2;
		//조건식이 true면 자료1을,
		//조건식이 false면 자료2를 연산한다.
		
		int i = 5>3? 10 : 20;
		
		System.out.println(i);
		System.out.println("======================");

		String name = 6<=6 ? "김연아" : "류현진";
		
		System.out.println(name);
		
		
	}//main() end
	
}//Ex5 end
