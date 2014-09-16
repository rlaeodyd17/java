package homework;

public class Prob2 {

	public static void main(String[] args) {
		
		//바깥쪽 for문의 i가 단수
		for(int i=1 ; i<5 ; i++ ){
					
		//안쪽 for문의 j가 1~9까지
			for (int j=2; j < 4; j++) {
					
				System.out.print(i +":"+ j +"\t");
			}
			System.out.println();
		} //for for() end
	}//main() end
}//Prob2 end
