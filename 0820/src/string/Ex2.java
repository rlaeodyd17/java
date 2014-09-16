package string;

public class Ex2 {

	public static void main(String[] args) {
		
		String s = new String("안녕?");
		String s2 = new String("안녕?");
		String s3 = "안녕?";
		String s4 = "안녕?";
		s2 = s3;
		s3 = null;
		
		System.out.println(s==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4=s);
		
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s));
		
		
	}//main() end
}//Ex2 end
