package string;

public class APIEx1 {
	
	public static void main(String[] args) {
		
		//API를 공부한다는 것은 메서드를 공부하는 것입니다.
		
		//메서드를 공부한다는 것은 
		
		//메서드이름 / 기능 / 인자 / 리턴값
		
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZkkkkkkggggggdfd";
		
		//1) charAt메서드
		// - 기능 : index를 넘겨주면 문자하나를 넘겨주는 메서드
		// - 인자 : int형 1개
		// - 리턴 : char형 
		
		char c = str.charAt(33);
		
		System.out.println(c);
		
		str = "index.html";
		
		//endsWith메서드 
		// -기능 : 어떤 문자열로 끝나는지 확인하는 메서드
		// -인자 : String형 1개
		// -리턴 : boolean형
		
		boolean result = str.endsWith(".html");
		
		System.out.println(result);
	
		//equalsIgnoreCase메서드
		// -기능 : 영어에서 대소문자빼고 값만 비교
		str = "JAVA";
		System.out.println(str.equalsIgnoreCase("java"));
		
		//indexOf메서드
		// -기능 : 해당문자열(문자)이 등장하는 index번지 숫자를 리턴해 주는 메서드 
		str = "Hello Java!! ^^";
		
		int index = str.indexOf("a");
		
		System.out.println(index);
		
		//lastIndexOf메서드: 뒷쪽부터 검색
		
		//length메서드 
		//- 기능: 문자열의 글자갯수를 알아내는 메서드
		
		str = "bcdefghijk";
		
		int length = str.length();
		
		System.out.println(length);
	}//main() end
	

}//APIEx1 end
