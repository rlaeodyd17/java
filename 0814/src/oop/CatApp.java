package oop;

public class CatApp {

	//변수
	
	//1) 지역에 따른 분류 : 클래스영역(멤버필드)
	//						메서드영역(지역변수)
	
	//2) 자료형에 따른 분류: 기본, 객체
	
	//기본자료형변수 : 값이 직접 들어감
	//객체자료형변수 : 객체의 레퍼런스 참조 !
	
	
	
	public static void main(String[] args) {
		
		//Cat클래스를 가지고 만들어진 객체의 레퍼런스를 참조하는 지역변수 cat1 
		Cat cat1;
		
		cat1 = new Cat();
		
		cat1.name = "야옹이";
		
		cat1.age = 2;
		
		cat1.height = 100;
		
		cat1.species = "호랑이";
				
		cat1.location = "마석";
		
		System.out.println(cat1.name);

		//Cat클래스를 가지고 만들어진 객체의 
		//레퍼런스를 참조할 수 있슨 myCat이라는 변수 선언
		
		Cat myCat;
		
		//Cat클래스 생성자를 호출하여 객체[객체는 'new Cat();'임을 주의하자!!!]를 만든 다음, 그 레퍼런스를 myCat이라는 변수에 대입
		
		myCat = new Cat();
		//고양이의 이름,나이,종,지역, 키를 입력하고 모두 출력
		
		myCat.name = "방울이";
		
		myCat.age = 1;
		
		myCat.height = 30;
		
		myCat.species = "페르시안 고양이";
		
		myCat.location = "수원";
		
		System.out.println(myCat.name);
		System.out.println(myCat.age);
		System.out.println(myCat.height);
		System.out.println(myCat.species);
		System.out.println(myCat.location);
	
	}//main() end
	
	
}//CatApp end
