package string;

public class BufferEx {

	public static void main(String[] args) {
		
//		String str = "Hello";
//		
//		str += "World";
//		str += "World";
//		str += "World";	
//		str += "World";
//		str += "World";
//		str += "World";	
//		str += "World";
//		str += "World";
//		str += "World";	
//		str += "World";
//		str += "World";
//		str += "World";	
//		str += "World";
//		str += "World";
//		str += "World";	

		//String은 편집불가
		//StringBuilder(Aftrer Java5.0)나 StringBuffer를 사용
		
		//StringBuffer / StringBuilder는 똑같은 기능을 합니다.
		
		//단, 동기화여부
		//동기화처리가 된 클래스는 StringBuffer
		//동기화처리가 안된 클래스는 StringBuilder
		
		//속도는 StringBuilder가 더 빠르다!
		
		String str = "Hello";
		
		str+= " ";
		
		str+="World";
		
		str+="!!";
		
		//위의 코드를 StringBuilder로 변경 --> String 과는 달리 객체가 하나만 만들어지므로 메모리 공간을 절약할 수 있다.
		
		StringBuilder sb = new StringBuilder("Hello");
		
		//append()
		sb.append(" ");
		sb.append("World");
		sb.append("!!");
		
		System.out.println(str);
		
		//StringBuilder는 String형은 아님
		//그러므로 String형으로 변환하는 메서드 toString(object에서 상속 받는다)을 쓴다.
		String s = sb.toString();
		
		System.out.println(s);
		
	}//main() end	
	
}//BufferEx end
