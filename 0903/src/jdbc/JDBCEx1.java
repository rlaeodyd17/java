package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) throws Exception {
		
		//0) jdbc 드라이버를 프로젝트에 연결 --> 
		//(Exception in thread "main" java.lang.ClassNotFoundException: oracle.jdbc.OraleDriveroracle.lib) !! 
		
		//1) 메모리에 드라이버 로딩 
		Class.forName("oracle.jdbc.OracleDriver");
		
		System.out.println("드라이버 메모리등록!");
		
		//2) 커넥션연결을 위한 url,user,password 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111"; 
		
		//3) 커넥션 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("커넥션 연결!");
		
		//4) 스테이트먼트 구문 생성
		Statement stmt = con.createStatement();
		
		//5) SQL 구문 작성
		String sql = "UPDATE singers SET height = 200";
		
		sql += "WHERE idx = 6";
		
		System.out.println(sql);
		
		//6) 수행(후 SELECT문의 경우 결과를 출력)
	    int result =stmt.executeUpdate(sql);
		
	    System.out.println(result + "행 업데이트완료!");
	    
	}//main() end
	
}//JDBCEx1 end
