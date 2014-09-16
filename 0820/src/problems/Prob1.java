package problems;

public class Prob1 {

	int a;
	Prob1 b;
	
	void test(Prob1 a) {
		b = a;
	}
	void test2(int a) {
		a = a;
	}
	
	public static void main(String[] args) {
	
		Prob1 a = new Prob1();
		a.b = new Prob1();
		Prob1 b = a.b;
		a.test(a);
		b.test(a);
		a.a = 10;
		b.a = 5;
		a.test2(4);
		b.test2(7);
		
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(a.b.a);
		System.out.println(b.b.a);

	}
}//Prob1 end
