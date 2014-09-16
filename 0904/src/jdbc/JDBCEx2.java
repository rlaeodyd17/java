package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx2 {

	//prepared statement
	
	public static void main(String[] args) {
		
		//유저에게 입력받을 스캐너객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========전화번호 등록===========");
		
		System.out.println("이름을 입력하세요//^--^~~");
		
		String name = scan.nextLine();
		
		System.out.println("전화번호를 입력하세요~~ ^_^//");
		
		String phone = scan.nextLine();
		
		scan.close();
		
		//오라클과 연결하는 커넥션 객체변수 선언 및 초기화
		Connection con = null;
		//스테이트먼트 구문객체 선언 및 초기화
		//Statement stmt = null; -> 프리페어드스테이트먼트 구문객체로 선언
		PreparedStatement pstmt = null; //사용법이 약간 다름

		//sql을 작성할 때 필요한 데이터에 ?로 대체한다
		String sql = "INSERT INTO phonebook(no,name,phone)";
		//스펠링등에 주의해야 한다
		sql+= "VALUES(phonebook_seq.nextval, ?, ?)";
		
		System.out.println(sql);

		try {
			//커넥션 얻기
			con = ConnectionUtil.getConnection();
			
//			stmt = con.createStatement();
			//프리페어드스테이트먼트구문 준비
			pstmt = con.prepareStatement(sql);
			
			//??? 바인딩 변수 세팅
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
						
//			int result = stmt.executeUpdate(sql);
			int result = pstmt.executeUpdate();
			
//			
			
			System.out.println(result+ "명의 사람이 등록되었습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
			} catch (Exception e){
				
			}
			try {
				if(con != null){
					con.close();
				}
			} catch (Exception e){
				
			}
		}//try~catch end : finally 구문부터 마무리한다.
		
		
	}//main() end
	
}//JDBCEx2 end
