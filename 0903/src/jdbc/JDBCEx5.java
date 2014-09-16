package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

public class JDBCEx5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름입력");
		
		String name = scan.nextLine();
		
		System.out.println("전화번호입력('-'없이)");
		
		String phone = scan.nextLine();
		
		//필요한 객체변수들 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		
		//정보들 선언 및 초기화
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "INSERT INTO phonebook(no,name,phone) "
				+ "VALUES(phonebook_seq.nextval, '"+name+"', '"+phone+"')";
		System.out.println(sql);
		
		
		//try catch 구문
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("로딩 완료!");
			
			//커넥션 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 연결!");
			
			//스테이트구문 생성
			stmt = con.createStatement();
			System.out.println("스테이트구문 생성");
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+ "명이 입력되었습니다.");
			
		} catch (Exception e) {
			System.out.println("드라이버가 없네요~");
			e.printStackTrace();
		}
		finally {
			//커넥션 연결이 먼저 된 후, 스테이트 구문 생성이 됩니다.
			//따라서 DB 연결 종료시에는 역순으로 stmt객체를 닫아주고, con연결을 종료합니다. 
			//stmt -> con close() 합니다.
			try {
				if(scan != null ){
					scan.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(con != null){
					con.close();
				}
			}catch (Exception e){
				
			}
			try {
				if(stmt != null){
					stmt.close();
				}
			}catch (Exception e){
				
			}
		}//finally end 
		
	}//main() end
	
}//JDBCEx5 end
