package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCEx2 {
	public static void main(String[] args) throws Exception {
		
		//1) 드라이버로딩
		Class.forName("oracle.jdbc.OracleDriver");
				
		//2) 커넥션연결을 위한 url,user,password 작성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password ="1111";
		
		//3) 커넥션객체 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("커넥션연결 성공!");
		
		//4) 구문객체 생성
		Statement stmt = con.createStatement();
		
		System.out.println("구문객체 생성 성공!");
		
		//5) SQL구문 작성(이적의 성별을 'F'로)
		String sql = "UPDATE singers SET gender ='F' WHERE idx=15";
		
		//6) 수행
		stmt.executeQuery(sql);
		
		System.out.println("수행완료!");
	}//main end

}//JDBCEX2 end
