package control;

public class ForEx3 {

	public static void main(String[] args) {
		
		//구구단을 전부 출력할 때는 
		
		//바깥쪽 for문의 i가 단수
		for(int i=2 ; i<10 ; i++ ){
			
			//안쪽 for문의 j가 1~9까지
		 for (int j=1; j < 10; j++) {
			
			System.out.print(i + " * " + j + " = " + (i*j) + "\t");
		 }
		 //한줄 내려감
		 System.out.println();
	 	}
	}//main() end
	
}//ForEx3 end
