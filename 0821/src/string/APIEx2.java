package string;

public class APIEx2 {

	
	public static void main(String[] args) {
	
		//API를 공부한다는 것은 특정클래스의 특정메서드를 공부한다는 것이고,
		
		//메서드를 공부한다는 것은 메서드의 기능과 인자와 리턴값을 공부한다는 것이다.
		
		//substring메서드
		
		// - 기능 : 문자열중의 특정 문자열을 잘라냅니다.
		
		String str = "가나다라마바사아자";
		
		System.out.println("갯수: "+ str.length());
		
		System.out.println(" '마'의 index: " + str.indexOf("마"));
		
		System.out.println("3번지의 글자 : " + str.charAt(3));
	
		System.out.println(str);
		
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(str2.substring(15));
		
		System.out.println(str2.substring(4,10));
	
		 ;                  //String관련 메서드는 원본 문자열은 바뀌지 않습니다. 
		
		String s = str.substring(2,5);
		System.out.println(s);
		System.out.println(str);

	}//main() end
	
	
}//APIEx2 end 
