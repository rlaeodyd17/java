package operator;

public class Ex1 {

 public static void main(String[] args) {

	 //연산자
	 
	 //연산을 수행하는 부호
	 
	 // +연산자
	 
	 //숫자에서는 덧셈
	 //문자열에서는 문자열합침
	 
	 //int형 데이터 변수 a를 선언하고 int형 정수 5를 값으로 초기화(대입) 
	 int a = 5;
	 
	 int b = 3;
	 
	 //문자열 합침 
	 System.out.println("a + b = "+a+b);
	 
	 //숫자 계산위한 우선순위 높여줌
	 System.out.println("a + b = "+(a+b));
		
	 // -연산자
	 //숫자끼리 뺄셈
	 System.out.println("a - b ="+ (a - b));
	 
	 // *연산자
	 // 숫자끼리 곱셈
	 System.out.println("a * b="+ (a*b));
	 
	 // '/'연산자
	 // 숫자끼리 나누기
	 // (정수일경우 소수점이 나오지 않습니다. --> 몫연산)
	 System.out.println("a / b="+ (a/b));
	 
	 // % 연산자
	 // 나머지를 구함
	 System.out.println("a%b=" + (a%b));
	 
	 
	}//main() end
	
}//Ex1 end
