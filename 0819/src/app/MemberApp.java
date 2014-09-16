package app;

//vo는 같은 패키지에 있을 경우에는 사용이 가능하지만, import하여 사용
import vo.Member;

public class MemberApp {

	
	public static void main(String[] args) {
		
		//컴퓨터 프로그래밍동아리는 컴공과, 14학번, 남자인 경우가 대부분입니다.
		
		Member m1 = new Member();
		
		
		m1.setName("류현진");
		m1.setMajor("컴공");
		m1.setCode("14학번");
		m1.setGender("남자");
		
		System.out.println(m1.getGender());
		
		Member m2 = new Member("박지성", "정보공", "13학번","남자");
		
		System.out.println(m2.getName());
		
		//성별이 기본값이 남자
		Member m3 = new Member("박태환", "건축", "12학번");
		
		System.out.println("이름 :" + m3.getName() + "  학과 : "+ m3.getMajor() + "  학번 :" + m3.getCode() + "  성별 :" + m3.getGender());
		//학번, 성별이 기본값
		Member m4 = new Member("박주영", "기계");
		System.out.println("이름 :" + m4.getName() + "  학과 : "+ m4.getMajor() + "  학번 :" + m4.getCode() + "  성별 :" + m4.getGender());
				
		//학번, 성별, 학과 기본값
		Member m5 = new Member("손흥민");
		System.out.println("이름 :" + m5.getName() + "  학과 : "+ m5.getMajor() + "  학번 :" + m5.getCode() + "  성별 :" + m5.getGender());
		
	}//main() end
	
}//MemberApp end
