package type;

public class TypeEx2 {

	public static void main (String[] args) {
		
		//정수형 : 4가지
		
		//1) byte : 1 byte (-128 ~ 0 ~ 127)
		//2) short : 2byte
		//3) int : 4byte
		//4) long : 8byte
		
		//byte형 변수 b를 선언하고 128으로 초기화
		byte b = 127;
		
		//short형 변수 s를 선언하고 128으로 대입
		short s = 128;
		
		//int형 변수 i를 선언하고 454565대입
		int i = 454565;
		
		//long형임을 명확하게 표현하려면 정수뒤에  L(l)을 씁니다.
		long l = 123L;
		
		//실수
		//1) float 4byte
		//2) double 8byte
		
		//float형 변수 f를 선언하고 0.0을 대입
		float f = 0.0f;
		
		double d = 12.343434343;
		
		System.out.print(d);
		
	}
}
