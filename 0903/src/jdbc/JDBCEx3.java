package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx3 {

	
	public static void main(String[] args) {
		
		//1)필요한 객체변수들 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		//2)정보들 선언 및 초기화
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "DELETE singers WHERE idx= 11";

		//3)try catch 구문
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("로딩 완료!");
			
			//커넥션 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 연결!");
			
			//스테이트구문 생성
			stmt = con.createStatement();
			System.out.println("스테이트구문 생성완료!");
			
			//수행
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "행 삭제!");
			
			}catch (ClassNotFoundException e) {
				System.out.println("드라이버가 없네요~");
				e.printStackTrace();
			}catch (SQLException e) {
				System.out.println("SQL예외 발생~");
				e.printStackTrace();
			}
				finally {
					//stmt,con을 close() 해줍니다. 
					//Scanner, Connection close 반드시 필요하다 
					//(I/O, Connection 등의 함수를 포함한 객체)
					try {
						if(stmt != null){
							stmt.close();
						}
					} catch (Exception e) {
						e.printStackTrace(); //생략할 수 있지만, 디버깅을 위해서 반드시 활용한다.
					}
					try {
						if(con != null){
							con.close();
						}
					}catch(Exception e) {}
					
			}//try~catch end 
			
		
	}//main() end
	
}//JDBCEx3 end 

