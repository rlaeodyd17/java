package method;

public class Calc {

	//정수 2개를 받아서 더하고 그 결과값을 리턴하는 메서드
	
	public int add(int a, int b) {
		
		return a + b;
		
	}//add() end
	
	//정수 2개를 받아서 빼고 그 결과를 리턴하는 subtract 메서드
	
	public int sub(int a, int b) {
		
		return a - b;
		
	}//sub() end (뺄셈)
	
	public int mul(int a, int b) {
		return a*b;
	}//mul() end (곱셈)
	
	public double div(double num1, double num2) {
		return num1 / num2 ;
	}//div() end (나눗셈)
	
}//Calc end
