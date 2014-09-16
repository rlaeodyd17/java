package vo;

public class Car {

	//제조사, 가격, 연비, 이름, 연료
	private String maker;
	private int price;
	private double mileage;
	private String name;
	private String fuel;
	
	//alt + shift + s --> r <setter // getter 자동 생성 기능 in Eclipse>
	
	//기본생성자
	
	public Car() {
		
	}
	
	public Car(String maker, int price, double mileage, String name, String fuel) {
		this.maker = maker;
		this.price = price;
		this.mileage = mileage;
		this.name = name;
		this.fuel = fuel;
	}
	//setter / getter 
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return this.maker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setMileage(double mileage){
		this.mileage = mileage;
	}
	public double getMileage(){
		return this.mileage;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setFuel(String fuel){
		this.fuel = fuel;
	}
	public String getFuel(){
		return this.fuel;
	}
}//Car end 
