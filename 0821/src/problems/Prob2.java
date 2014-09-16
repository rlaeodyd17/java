package problems;

public class Prob2 {

	public static void test(String str) {
		System.out.println(str);
	}//test() end
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("안녕");
		
		sb.append("하세요.");
		
		test(sb.toString());
		
	}//main() end
}//Prob2 end
