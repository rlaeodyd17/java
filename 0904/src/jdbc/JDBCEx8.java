package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx8 {

	public static void main(String[] args) {

		System.out.println("생년월일 4자리를 입력 하세요");
		
		Scanner scan = new Scanner(System.in);
		
		String year = scan.nextLine();
		
		scan.close();
		
		//정보입력
		Connection con = null;
		PreparedStatement pstmt = null;
				
		
		//SELECT 구문 결과 및 sql
		ResultSet rs = null;
		
		String sql = "SELECT no,name,height,birth_date FROM students WHERE birth_date > ?";
				
				
		//		+ "WHERE birth_date > to_date(?, 'YYYY') ";
		
		
		
		try {
			//수행
			con = ConnectionUtil.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			Date birth = Date.valueOf(year+"-12-31");
			
			//?바인딩 세팅
			pstmt.setDate(1,birth);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String student = "번호 : "+rs.getInt(1)+" / 이름 : " +rs.getString("name") + " /키 :" + rs.getInt("height") 
						 +" /생년월일 :"+rs.getDate("birth_date") ;
					   
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
	
}//JDBCEx8 end
