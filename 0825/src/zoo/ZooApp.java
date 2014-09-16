package zoo;

public class ZooApp {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[6];
		
		animals[0] = new Wolf();
		animals[1] = new Tiger();
		animals[2] = new Cat();
		animals[3] = new Wolf();
		animals[4] = new Cat();
		animals[5] = new Wolf();
		
		for(int i=0; i < animals.length; i++) {
			animals[i].cry();
		}
	}//main() end
	
}//ZooApp end 

