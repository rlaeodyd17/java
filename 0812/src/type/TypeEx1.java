package type;

public class TypeEx1 {

	public static void main(String[] args) {
		
		//char형은 문자형 (한글자)
		
		//'' '\u0000 16진수 4자리' 
		
		//내부적으로 정수처리 (연산이 가능)
		
		//크기 : 2byte(0 ~ 65535)
		
		// char형 변수 c를 선언하고 문자 A를 대입 (초기화)
		// 변수 선언의 중복을 주의
		char c;
		c = 'A';
		
		// 변수 c에 문자 C를 대입
		c='C';
		
		// 변수 c에 유니코드49(1)을 대입
		c = 49;
		
		c = '\u0076';
		
		c = '\r';
		
		//System.out.print("김대용");
		System.out.print(c);
	}
}
