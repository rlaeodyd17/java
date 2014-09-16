package array;

public class Ex1 {

	
	public static void main(String[] args) {
		
		String[] names = new String[4];
		
		names [0] = "브루스 윌리스";
		names [1] = "김연아";
		names [2] = "박지성";
		names [3] = "손흥민";  
		
		//String[] names2 = {"김연아", "류현진"};
		
		//for문
//		for(int i=0;i < names.length ; i++ ){
//			System.out.println(names[i]);
//		}//for end
		
		//for each문
		for(String name: names){
			System.out.println(name);
		}
		
		//for each문 (java 5버전 이후)		
		//for( 그 배열의 각번지 자료형변수 :배열(혹은 컬렉션들) ) { }
		//배열(컬렉션 포함)의 모든 index에 접근할 때 사용
		
		int[] iArr = {3,5,8,10};
		
//		for(int i=0; i <iArr.length ; i++ ) {
//			System.out.println(iArr[i]);
//		}
		for( int i: iArr) {
			System.out.println(i);
		}
		
	}//main() end
	
}//Ex1 end 
