package string;

import java.util.StringTokenizer;

public class TokenizerEx {

	
	public static void main(String[] args) {
	
		String names = "이상훈,이준혁,김수영,백승준";
		
		//문자열을 특정 문자로 나눠서 각각의 문자열이 필요하다면
		//각각의 문자열이 필요하다면 (위의 names에서 각 이름들을 얻어오려면)
		//String객체에서 split메서드를 이용하거나 StringTokenizer클래스를 이용할 수 있다.
		
		StringTokenizer stok = new StringTokenizer(names, ",");
		
		//for, while 문 이용
		
		while(stok.hasMoreTokens()) {
			
			//nextToken()
			
			String name = stok.nextToken();
			
			System.out.println(name);
		
		}//while end
		
		System.out.println("===================================");
		
		String names2 = "아델,지드래곤,브루스윌리스,없음";
		
		StringTokenizer stok2 = new StringTokenizer(names2, ",");
		
		while(stok2.hasMoreTokens()) {
			
			String name2 = stok2.nextToken();
			
			System.out.println(name2);
		}
		
	}//main() end
	
}//TokenizerEx end
