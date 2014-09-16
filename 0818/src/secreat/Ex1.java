package secreat;

public class Ex1 {

	static   int a;
	
	static void test() {
		
		System.out.println("Call Call Call~~!!!");
		
	}//test() end
	
	//자바의 숨겨진 비밀
	
	//1) 같은 클래스 내부에 있는 static멤버에 접근 시 (클래스명.) 생략 가능
	
	public static void main(String[] args) {
		
		//*****스테틱 멤버에 접근할때는 "클래스명."으로 접근(자바의 기초, 반드시 지키자!) *****!!!!
		
		//*****인스턴스 멤버에 접근할때는 "객체 생성 후 그 객체의 레퍼런스로" 접근 ***** !!!
		Ex1.a = 6; 
		
		//Ex1객체를 생성 후 test() 호출
		//Ex1 ex = new Ex1();
		
		//ex.test();
		
		Ex1.test();
		
	}//main() end
	
}//Ex1 end
