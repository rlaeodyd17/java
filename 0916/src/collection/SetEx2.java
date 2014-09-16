package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("김연아");
		set.add("이승우");
		set.add("손흥민");
		set.add("류현진");
		set.add(9);
		
		//set안의 정보를 전부 출력 향상된 for문에 ***( 자료형 :배열 or 컬렉션)*** 을 사용하여 활용할 수 있다!!!!
		//***SET은 인덱스가 없으므로 일반 for문 사용 불가
		
		for(Object str: set){ //add의 인자가 Object 형이므로 객체의 형변환이 될 수 있다. 
			System.out.println(str.toString()); //toString() set객체의 오버라이딩
		}
		
	}
}
