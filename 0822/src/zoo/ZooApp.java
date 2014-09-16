package zoo;

import animal.Animal;
import animal.Dog;
import animal.Camel;
import animal.Cat;
import animal.Lion;
import animal.Snail;


public class ZooApp {

	public static void main(String[] args) {
		
		//강아지 객체 생성
		
		Animal [] animals = new Animal[10];

		animals[0] = new Dog();
		animals[1] = new Lion();
		animals[2] = new Dog();
		animals[3] = new Snail();
		animals[4] = new Dog();
		animals[5] = new Camel();
		animals[6] = new Cat();
		animals[7] = new Camel();
		animals[8] = new Snail();
		animals[9] = new Lion();
		
		for(int i = 0 ; i < animals.length ; i++) {
			System.out.println(animals[i]);
		} //for end
		
		
		for( Animal animal : animals) {
			System.out.println(animal);
			
		}
		
			
		
	}//main() end
	
}//ZooApp end 
