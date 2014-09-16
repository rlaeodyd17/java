package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색할 성(姓)을 입력하세요~");
		
		String lastName = scan.nextLine();
		
		scan.close();
		//정보입력
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//SELECT 구문 결과
		ResultSet rs = null;
		
		
		String sql = "SELECT no,name,birth_date,height FROM students WHERE name LIKE ?";
				
		try {
			con = ConnectionUtil.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			//?바인딩 세팅
			pstmt.setString(1,lastName+"%");
			
			rs = pstmt.executeQuery();
			
			//출력
			while(rs.next()){
				
				String student = "이름" +rs.getString("name");
				System.out.println(student);
			}
			
			//			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
			}catch (Exception e){
				
			}
			try {
				if(pstmt != null){
					pstmt.close();
				}
			}catch (Exception e){
				
			}
			try {
				if(con != null){
					con.close();
				}
			}catch (Exception e){
				
			}
		}//try~catch end 
		
	}//main() end
	
}//JDBCEx6 end 
