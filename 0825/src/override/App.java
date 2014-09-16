package override;

public class App {

	public static void main(String[] args) {
		
		Object o = new C();
		
		A a = (A) o;
		
		System.out.println(a.a);
		
		B b =(B) o;
		
		System.out.println(b.a);
		
		C c =(C) o;
		
		System.out.println(c.a);
	
		
		//오버라이딩은 인스턴스 내부에 있는 객체들이 똑같은 메서드를 가지고 있을 때 발생합니다.
		
		//어떤 2차 레퍼런스에서 그 메서드를 호출해도 최하위 자손클래스의 메서드가 호출 됩니다.
		
	}//main() end
}//App end
