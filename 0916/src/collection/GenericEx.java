package collection;

import java.util.Set;
import java.util.TreeSet;

public class GenericEx {
	
	public static void main(String[] args) {
		
		
		//Generic 이란 컬렉션안에 들어갈 객체의 자료형을 지정하는 방법입니다.
		
		Set<String> names = new TreeSet();
		
		names.add("박지현");
		names.add("이준혁");

		names.add("김수영");
		
		for( String name: names){
			
			String str = (String) name;
			
			System.out.println(str.charAt(0));
			
		}
	}
}
