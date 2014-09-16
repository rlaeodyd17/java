package operator;

public class Ex4 {

	public static void main(String[] args) {
		//항등연산자
		//'=='
		
		//대입연산자
		//'='
		
		int a = 5;
		int b = 3;
		
		boolean result = (a == b);
		
		System.out.println(result);
		
		System.out.println("=================");
		
		// a = a + 2;
		a += 2;
		
		System.out.println(a);
		
		System.out.println("=================");
		
		//a는 7이고 b는 3이기 때문에 '같지않다' 항등연산의 결과는 false
		result = a!=b;
		
		System.out.println(result);
		
		System.out.println("=================");
		
		//후위증가 vs. 전위증가 !!!
		a = 5;
		
		//한줄에 쓸때는 전위/후위 상관없이 증가
		a++;
		
		b = ++a;
		
		System.out.println(a+":"+b);
		
		//대입연산자와 함께 사용하면 후위연산자가 대입연산자보다 우선순위가 낮아서 대입 후 증가
		
		b= a++;
		System.out.println(a+":"+b);
		
		
		
	}//main() end
	
}//Ex4 end
