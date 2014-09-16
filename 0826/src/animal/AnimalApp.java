package animal;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal animal1 = new Pig();
		
		animal1.cry();

		
		Animal animal2 = new Cat();
		
		animal2.cry();
		
		// Animal animal = new Animal(); --> 추상으로 선언하면 인스턴스를 만들 수 없다!! 
		
	}//main() end;
	
}//AnimalApp end
