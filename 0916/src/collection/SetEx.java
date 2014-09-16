package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	
	public static void main(String[] args) {
		
		//컬렉션 인터페이스들은 객체들을 모읍니다.
		   //인터페이스는 메서드를 동일하게 구현한 것으로 생성자, 
		//(배열처럼 객체들을 모아서 편리하게 사용하기 위해서)
		
		
		//Set 인터페이스를 구현한 클래스는 대표적으로 HashSet, TreeSet이 있음
		
		//set은 무엇이며 메서드는 무엇인지 아는 것을 목표로 하자!
		
		//**중복을 허용하지 않습니다. **
		
		//Map
	
		
		//List
		
		Set set = new HashSet();
		
		set.add("안녕?");
		
		set.add(new SetEx());
		
		set.add(4); //암시적 객체생성, wrapper클래스를 이용하여 오토박싱하고 있음
		
		set.add(new Integer(4)); // 명시적 객체 생성 
		
		System.out.println(set.size());
		
	}
}
