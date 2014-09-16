package operator;

public class Ex3 {

	 public static void main(String[] args) {
		
		 // ! 연산자(NOT)
		 //논리값 앞에 붙여서 반대의 의미
		 
		 //!true
		 //!false
		 
		 boolean result = 5 >= 4;
		 
		 System.out.println(!result);
		 
		 // ++ / --  전위/후위 증감연산자 (우선순위가 다르다)
		 
		 //변수에 붙어서 1증가 / 1감소
		 
		 int a = 5;
		 
		 //전위증가연산자 : 1증가
		 ++a;
		 
		 //후위증가연산자 : 1증가
		 
		 a++;
		 
		 //1증가후 출력
		 System.out.println(++a);
		 
		 System.out.println("==================");
		 
		 //후위감소연산자
		 a--;
		 
		 //전위감소연산자
		 --a;
		 
		 System.out.println(a);
	}//main() end
	 
}//Ex3 end
