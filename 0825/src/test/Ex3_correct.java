package test;


public class Ex3_correct {

	public static void main(String[] args) {
				
		for(int i=0;i< 5; i++) {
			System.out.println((i+1)*2);
		}
		
		for(int i=2; i<=10; i+=2){
			System.out.println(i);
		}
	System.out.println("===============================");	
		for(int i =1; i<=10; i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
	System.out.println("===============================");	
	//1,3,5,7,9	
	for(int i=1; i<=10; i+=2) {
		System.out.println(i);
	}
	
	}//main() end
}//Ex3_correct end
