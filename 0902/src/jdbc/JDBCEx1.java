package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) throws Exception {
		
		//JDBC 코딩
		
		//1) 드라이버 클래스를 메모리에 로딩시킨다.
		Class.forName("oracle.jdbc.OracleDriver");
//		Class.forName("oracle.jdbc.OracleDriver");
		//2) 데이터베이스와 연결하는 커넥션객체를 생성한다.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password ="1111";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("커넥션 연결!");
		//3) SQL구문을 수행하는 스테이트먼트객체를 생성한다.

		Statement stmt = con.createStatement();
		
		System.out.println("구문 생성!");
		//4) SQL구문 작성

		String sql = "DELETE singers WHERE idx=2";
		//5) 수행
		
		stmt.executeQuery(sql);
		
		System.out.println("수행!");
	}//main() end
	
}//JDBCEx1 end
