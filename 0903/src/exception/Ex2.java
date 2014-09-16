package exception;

public class Ex2 {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		
		//서로다른 예외를 다른 방법으로 처리하기 위해서
		//catch 구문이 여러개 있을 수 있습니다.
		//(if ~ else if 구문처럼)
		try {
			System.out.println(2);
			System.out.println(5/0); //Exception이 발생한 곳에서 실행이 멈추고 바로 catch 구문이 작동됩니다.
			System.out.println(3);
			
		} catch (Exception e) {
			System.out.println(4);
			
		}
		System.out.println(5);
		
	}//main() end

}//Ex2 end 

