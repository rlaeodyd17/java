package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 사람 이름입력");
		
		String name = scan.nextLine();
		
		//커넥션, 스테이트먼트 객체 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		
		//정보(url,user,password,sql)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "DELETE singers WHERE name = '"+name+"'";
		
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("로딩 완료!");
			
			//커넥션 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 연결");
			
			//스테이트구문 생성
			stmt = con.createStatement();
			System.out.println("스테이트구문 생성");
			
			//수행
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+"가 삭제되었습니다.");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이버가 없네요!");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("SQL예외 발생!");
			e.printStackTrace();
		} finally {
			//scan,stmt,con을 close() 합니다.
			 try {
				 if(scan != null){
					 scan.close();
				 }
			 } catch (Exception e){
				 e.printStackTrace();
			 }
			 try {
				 if(stmt != null){
					 stmt.close();
				 }
			 }catch (Exception e){}
			 
		}//try~catch end
		
		System.out.println("명이 삭제되었습니다.");
		
	}//main() end
	
	
}//JDBCEx4 end

