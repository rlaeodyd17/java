package exception;

public class Ex5 {

	public static void main(String[] args) {
		
		
		//예외를 강제로 발생시키는 방법
		//throw : 실제로 에러를 예외로 처리하는 경우가 있다.
		//예외를 처리한다 : 무조건 try catch구문을 사용
		//throws Exception: 예외처리를 다른 곳으로 위임한다.
		
		
		try {
			throw new Exception();
			
		}catch (Exception e) {
			
		}
		
		
		//RuntimeException을 상속받은 예외들은 예외처리 안해도 됩니다.
		//반대로 얘기해보면 RuntimeException을 상속받지 않은 모든 예외는
		//무조건 예외처리 해야 합니다. 

		//throw new RuntimeException();
		
		
		
	}//main() end
	
	
}//Ex5 end
