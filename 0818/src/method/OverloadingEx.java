package method;

public class OverloadingEx {
	
	void test(boolean i, int j) {
		System.out.println(1);
	}
	
	void test(int i, boolean j) {
		System.out.println(2);
	}
	public static void main(String[] args) {
		
		OverloadingEx e = new OverloadingEx();
		
		e.test(3, false);
		
		//접근제한자
		
		//private, default , protected, public
		
		
		//static
		
		//Call by Value / Call by Reference
		
		//자바의 숨겨진 비밀
		
		//오버로딩은 과적이라는 뜻으로 메서드명이 동일한데 인자가 다른 것
		
		//인자가 다르다는 것은 
		//1) 인자의 "<자료형>"이 다르다.
		//2) 인자의 갯수가 다르다.
		//3) 인자의 순서가 다르다.
		
		

		
	}//main() end

}//OverloadingEx end
