package animal;

//추상의 키워드 abstract

//추상클래스는 일반글래스와 동일합니다.
//하지만 추상으로 선언하면 인스턴스를 만들 수 없습니다!!!!


public abstract class Animal {

	//추상클래스는 추상메서드를 반드시 가질 필요는 없습니다.
	//****그러나 하나라도 추상메서드를 가지고 있으면 반드시 추상클래스이어야만 합니다!!!****
	//****추상메서드란 작동구문은 없고 이름 선언만 되어 있는 메서드입니다.**** 더욱 중요한 개념(추상메서드)!!!
	
	public abstract void cry();
	
	
//	public void cry() {
//		System.out.println("크흐하하하크하하~");
//	}
//	
}
