package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEx6 {

	public static void main(String[] args) {
		
		
		//커넥션 및 스테이트먼트 객체 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		//SELECT구문에 필요한 ResultSet
		ResultSet rs = null;
		
		//정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "SELECT no,name,phone FROM phonebook ";
		
		//try catch 구문
		try {
			//메모리에 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//커넥션 얻기
			con = DriverManager.getConnection(url, user, password);
			
			//스테이트먼트 구문 생성
			stmt = con.createStatement();
			
			//INSERT,UPDATE,DELETE구문은 
			//executeUpdate() 리턴값이 int형(행의 갯수)
			
			//SELECT구문은 executeUpdate() 
			//리턴값이 ResultSet 객체입니다 !!!
			
			//수행후 ResultSet 얻기
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print("이름:"+rs.getString(2));
				//System.out.print("이름:"+rs.getString("name"));
				
				System.out.print("/번호:"+rs.getInt(1));
				//System.out.print("/번호:"+rs.getInt("no"));
				
				System.out.println("/전화번호:"+rs.getString(3));
				//System.out.println("/전화번호:"+rs.getString("phone"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//"rs",stmt,con을 close() 해줍니다. 
			//Scanner, Connection close 반드시 필요하다 
			//(I/O, Connection 등의 함수를 포함한 객체)
			
			//안전한 코딩!!! 
			try {
				if(rs != null){
					rs.close();
				}
			}catch(Exception e){
				
			}
			try {
				if(stmt != null ){
					stmt.close();
				}
			}catch (Exception e){
				
			}
			try {
				if(con !=null){
					con.close();
				}
				
			}catch (Exception e){
				
			}
		}//finally end 
		
	}//main() end
	
}//JDBCEx6 end
