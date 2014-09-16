package phonebook;

public class PhonebookApp {

	public static void main(String[] args) {
		
		Person[] people = new Person[3];
		
		people[0] = new Person("이준혁", "010-6609-5371", "마석");
		
		people[1] = new Person();
		people[1].setAddress("신림");
		people[1].setName("김수영");
		people[1].setPhone("010-9431-1439");
		
		people[2] = new Person("김대용", "010-1234-56878","수원");
		
		//이름 : xxx / 전화번호: xxxx-xxxx-xxxx / 주소 : xxx
		
		for (int i=0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}
		
		for (Person p: people) {
			System.out.println(p.toString());
		}
		
		//오버라이딩의 명시적인 예 
		for (Object o: people) {
			System.out.println(o.toString());
		}
	}//main() end
}//PhonebookApp end
