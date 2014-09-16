package type;

public class TypeEx3 {
	public static void main(String[] args) {
		
		byte a = 127;
		byte b = 127;
		
				
		//byte c= (byte) (a + b); 강제형변환 --> 데이터 손실 , ()연산자가 cast 연산자 보다 우선순위가 높다.
		
		int c = a + b;
		
		
		//연산을 할때는 int형을 기준으로 한다.
		//byte, short, int는 연산하면 결과가 무조건 int형 
		System.out.println(c);
		
	}//main() end
	
}//TypeEx3 end
