package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectionUtil;

public class JDBCEx5 {

	public static void main(String[] args) {
		
		System.out.println("====학생정보 전부 출력=====");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//SELECT구문 결과
		ResultSet rs = null;
	
		String sql = "SELECT no,name,birth_date,height FROM students ORDER BY height DESC";
		try {
			//커넥션 연결
			con = ConnectionUtil.getConnection();
			//준비된 구문
			pstmt = con.prepareStatement(sql);
			
			//?바인딩 세팅//
			
			//SELECT 수행
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				String student = "번호: "+rs.getInt("no");
				student+=" / 이름: "+rs.getString("name");
				student+=" / 생년월일 : "+rs.getDate(3);
				student+=" / 키 : "+ rs.getInt("height");
				
				System.out.println(student);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				//rs --> pstmt --> con 순으로 close
				if(rs != null){
					rs.close();
				}
			}
			catch (Exception e){
			}
			try {
				if(pstmt != null){
					pstmt.close();
				}
			}
			catch (Exception e) {
			}
			try {
				if(con != null){
					con.close();
				}
			}
			catch(Exception e){
			}
		}//try~catch end 
		
		
	}//main() end
	
}//JDBCEx5 end
