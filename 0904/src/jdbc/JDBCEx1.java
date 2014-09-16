package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class JDBCEx1 {

	public static void main(String[] args) {
		
		//agencies를 전부 출력
		
//		//정보 입력
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "test";
//		String password = "1111";
		String sql = "SELECT idx,name FROM agencies";
		
		
		
		//커넥션,스테이트먼트,ResultSet 객체 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			
//			//메모리에 드라이버 로딩
//			Class.forName("oracle.jdbc.OracleDriver");
//			//커넥션 연결
//			con = DriverManager.getConnection(url, user, password);
		
			// ConnectionUtil 패키지를 static객체로 선언하면 객체생성없이 JDBCEx1에서 바로 접근할 수 있다.
			// 클래스를 만들고 util을 만들어서 중복된 코드를 줄일 수 있다. 
			
			con = ConnectionUtil.getConnection();
			//스테이트구문 생성
			stmt = con.createStatement();
			
			//결과후 ResultSet 얻기
			rs = stmt.executeQuery(sql);
			
			//while문으로 결과 출력
			while(rs.next()){
				System.out.print("번호: "+rs.getInt("idx"));
				System.out.println(" / 회사명: "+rs.getString("name"));
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//사용한 자원 반납 처리 : rs-> ->stmt -> con 순서로 close
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
		//메모리에 드라이버 로딩
		
		
		
	}//main() end
	
}//JDBCEx1 end
