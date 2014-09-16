package method;

public class CalcApp {

	public static void main(String[] args) {
		
		//Calc형 객체자료형 변수 calc를 선언
		Calc calc;
		
		//Calc객체를 생성 후  그 레퍼런스를 calc변수에 대입
		calc = new Calc();
		
		int a =8;
		int b=5;
		
		
		int result = calc.add(a, b); // 리턴되는 자료형과 입력되는 자료형을 맞춰 주어야 한다.
		
		System.out.println(a + "+" +b + "=" + result);
		
		result = calc.sub(a, b);
		
		System.out.println(a +"-" +b + "=" + result);
		
		result = calc.mul(a, b);
		
		System.out.println(a +"*"+b+ "=" + result);
		
		double result1 = calc.div(a, b);
		
		System.out.println(a +"/"+b+ "=" + result1);
		
	}//main() end
	
}//CalcApp end
