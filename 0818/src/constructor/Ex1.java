package constructor;

public class Ex1 {

	// 자바의 숨겨진 비밀
	
	//1) ***같은 클래스 내부에서 static 멤버 접근 시 (클래스명.) 생략***
	
	//2) ***개발자가 단 하나라도 생성자를 선언하지 않으면 컴파일러가 컴파일시 기본생성자를 만들어 줌***
	
	
	//생성자 선언
	//사용법 --> **** 접근제한자 클래스명() {} *****
	
	public Ex1() {
		System.out.println("생성자!!");
	}
	
	//메서드(리턴값)
	public void Ex1() {
		
	}
	public static void main(String[] args) {
	
		//Ex1클래스를 가지고 만들어진 객체의 레퍼런스를 저장할 수 있는 e라는 지역변수를 선언하고
		
		//new라는 키워드로 heap메모리 영역을 할당받고 Ex1()생성자를 호출하여 객체를 생성 후 그 레퍼런스를 변수 e에 대입
		Ex1 e = new Ex1();
		
		
	}//main() end
	
}//Ex1 end

