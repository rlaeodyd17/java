package exception;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(1);
		//catch는 상속관계에서 부모가 자식보다 먼저 선언되면
		//dead code가 되므로 
		//Exception이 실행되는 순서를 자식클래스가 먼저 선언 되도록 수정해야 한다. 		
		try {
			System.out.println(2);
			
			System.out.println(4/0);
			
			System.out.println(3);
			
		}catch(ArrayIndexOutOfBoundsException e) { //14번 라인의 ArithmaticException과 관련이 없으므로 실행되지 않는다.
			System.out.println(4);
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println(5);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(6);
			e.printStackTrace();
		}
		System.out.println(7);
		
	}//main() end
	
}//Ex3 end
