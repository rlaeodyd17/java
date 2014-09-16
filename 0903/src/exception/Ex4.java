package exception;

public class Ex4 {

	public static void main(String[] args) {
		
		//예외가 발생할 수도 있고, 발생하지 않을 수도 있지만 
		//무조건 수행해야 하는 문장을 작성하는 곳이 바로
		//finally 구문
		
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(5/0);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
			//실제 현업에서 프로젝트 만들때 
			//e.printStackTrace는 디버깅 용도로 무조건 사용합니다.
			e.printStackTrace(); 
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
			
	}//main() end
	
}//Ex4 end
