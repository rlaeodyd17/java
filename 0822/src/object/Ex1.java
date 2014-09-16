package object;

public class Ex1 {

	public static void main(String[] args) {
		
		//Object는 우리나라의 단군과 같은 존재입니다.
		
		//모든 클래스의 조상입니다.
		//그래서 모든 객체는 object에서 상속받은 toString()등 여러 메서드를 공통으로 가집니다.
		
		Object obj = new Object();
		
		System.out.println(obj);          
		
		//자바의 숨겨진 비밀
		//1) System.out.print(객체)는 객체.toString()을 출력
		System.out.println(obj.toString());
		
		//equals메서드
		//일반객체들은 레퍼런스 비교
		//String, Wrapper클래스들은 값비교
		
		//toString()객체를 String형으로 일반객체는 패키지.클래스명@해쉬코드
		
		//String,Wrapper들은 값이 출력
		
		
		
	}//main() end 
	
}//Ex1) end 
