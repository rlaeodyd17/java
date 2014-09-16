package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {

	public static void main(String[] args) {
		
		//1)  
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "DELETE singers WHERE idx =4 ";
		
		Connection con = null;
		Statement stmt = null;
		
		
		try {
			//예외처리를 위해서 속도가 느려집니다.
			//여기 안 코드는 최소로!!!!
			
			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("로딩 완료!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 연결!");
			
			stmt = con.createStatement();
			System.out.println("스테이트구문 생성완료!");

			int result = stmt.executeUpdate(sql);
			
			System.out.println(result +"행 삭제!");

			} catch (ClassNotFoundException e) {
				System.out.println("드라이버가 없네요~~");
				e.printStackTrace();
				
			}catch(SQLException e) {
				System.out.println("SQL예외 발생~");
				e.printStackTrace();
			}
	}//main() end
	
}//JDBCEx2 end 
