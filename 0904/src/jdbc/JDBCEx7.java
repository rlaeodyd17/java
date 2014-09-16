package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx7 {

	public static void main(String[] args) {

		System.out.println("키를 입력 하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int height1 = scan.nextInt();
		
		scan.close();
		
		//정보입력
		Connection con = null;
		PreparedStatement pstmt = null;
				
		
		//SELECT 구문 결과 및 sql
		ResultSet rs = null;
		
		String sql = "SELECT no,name,height,birth_date FROM students WHERE height >= ?";
		
		
		
		try {
			//수행
			con = ConnectionUtil.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			//?바인딩 세팅
			pstmt.setInt(1,height1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String student = "키 :" + rs.getInt("height")+ " / 이름 :" +rs.getString("name");
					   
				System.out.println(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			//rs --> pstmt --> con close
			try {
				if(rs != null){
					rs.close();
				}
			} catch (Exception e) {
			
			} try {
				if(pstmt != null){
					pstmt.close();
				}
			} catch (Exception e) {
				
			}
			try {
				if(con != null){
					con.close();
				}
			} catch (Exception e){
				
			}
		}//try~catch end
		
	}//main() end
	
}//JDBCEx7 end

