package app;

import vo.Person;

public class PeopleApp {

	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setName("이준혁");
		p1.setAge(22);
		p1.setHeight(173);
		p1.setAddress("NamYangJu");
		p1.setPhone("010-6609-5497");
		p1.setHobby("Nothing");
		
		//우리들 정보
		
		Person p2 = new Person();
		p2.setName("Kevin Kim");
		p2.setAge(37);
		p2.setHeight(170);
		p2.setAddress("Suwon");
		p2.setPhone("010-5234-5045");
		p2.setHobby("baseball");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		System.out.println(p1.getHeight());
		System.out.println(p1.getHobby());
		System.out.println(p1.getPhone());
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddress());
		System.out.println(p2.getHeight());
		System.out.println(p2.getHobby());
		System.out.println(p2.getPhone());
		
	}//main() end
	
}//PeopleApp end
