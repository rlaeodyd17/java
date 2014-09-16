package method;

public class MethodEx2 {

	int test (int i) {
		i += 50;
		return i;
	}
	
	public static void main(String[] args) {
		 
		int i=7;
		
		MethodEx2 ex = new MethodEx2();
		
		ex.test(i);
		
		System.out.println(i);

			
		
	}//main() end
	
}//MethodEx2 end
