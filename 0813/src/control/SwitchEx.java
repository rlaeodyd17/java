package control;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		//switch문은 분기문 중 하나 --> 모든 switch문은 100% if문으로 전환될 수 있으나, 모든 if문이 switch로 변환될 수는 없다. 
		
		//()
		
		//비교데이터의 자료형은 자바6버전까지는 정수만(byte, short, int, char) 사용되었음
		//따라서 6버전에서 사용할 경우, String --> char 형으로 강제형변환하는 code가 추가 되어야 함!
		
		//7버전만에서 String이 추가 --> 주의 사항!!! 6버전에서 사용되지 않으므로 notice !!!
		
//		switch(비교데이터) {
//		case 비교할데이터 : 
//		case 비교할데이터 :
//		default :
//		}
		
		//A,B,C,D,F학점이 몇점인지 알려주는 프로그램 
		//A -> 91 ~ 100점사이
		
		//break는 반복문이나 switch문에 존재하여 break문을 만나면 그 반복문, 그 switch문을 끝냅니다.
		
		//char grade = 'A';
		
		String grade = "C";
	
		switch(grade) {
		case "A"://grade가 'A'라면 수행
			System.out.println("91~100");
			break;
		case "B"://grade가 'B'라면 수행
			System.out.println("81~90");
			break;
		case "C"://grade가 'C'라면 수행
			System.out.println("71~80");
			break;
		case "D"://grade가 'D'라면 수행
			System.out.println("61~70");
			break;
		default://A,B,C,D도 아니면
			System.out.println("60이하");
			
		}//switch() end 
	}//main() end
}//SwitchEx end
