package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	
	public static void main(String[] args) {
		
		//List는 무한배열
		//중복허용하고 index가 있어서 일반 for문으로도 접근 가능합니다.
		
		
		//List를 구현한 클래스는 대표적으로 
		//Vector / ArrayList
		
		//Vector는 동기화 가능 (속도는 약간 느림)

		//ArrayList 동기화 불가능 (속도빠름)
		
		List<String> names = new ArrayList<String>();
		
		names.add("김연아");
		names.add("류현진");
		names.add("손흥민");
		names.add("이승우");
		names.add("박지성");

		//향상된 for문
		for (String name :names){
			System.out.println(name);
		}
		
		//일반 for문
		for(int i=0; i<names.size(); i++){
			
			String name = names.get(i);
			System.out.println(name);
		}
	}
}
