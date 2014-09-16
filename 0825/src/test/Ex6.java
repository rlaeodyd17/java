package test;

public class Ex6 {

	public static void main(String[] args) {
		
		//int배열을 선언하고 길이가 5인 배열을 생성합니다.
		
		int[] iArr = new int[5];
		
		//각 0~4번지에 2,4,6,8,10 숫자로 초기화 합니다.
		
//		iArr [0] = 2;
//		iArr [1] = 4;
//		iArr [2] = 6;
//		iArr [3] = 8;
//		iArr [4] = 10;
//		
		
		//일반 for문으로 대입
		for(int i=0; i<iArr.length; i++) {
			iArr[i] =i*2+2;
		}

////		//일반 for문으로 출력
////		for(int i=0;i < iArr.length ; i++) {
////			System.out.println(iArr[i]);
//		}
		
		//향상된 for문으로 출력
		for(int i: iArr) {
			System.out.println(i);
		}
		
	}//main() end
}//Ex6 end
