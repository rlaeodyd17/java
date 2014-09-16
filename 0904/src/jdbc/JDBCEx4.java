package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx4 {
	public static void main(String[] args) {

		//사람 이름으로 삭제하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 사람이름을 입력하세요~");
		
		String name = scan.nextLine();
		
		scan.close();
		
		Connection con = null;

		PreparedStatement pstmt = null;
		
		String sql = "DELETE students WHERE name =?";
		
		try {
			//커넥션
			con = ConnectionUtil.getConnection();
			
			//준비된 구문을 준비
			pstmt = con.prepareStatement(sql);
			
			//? 바인딩 변수 세팅
			pstmt.setString(1, name);
			
			//수행
			int result = pstmt.executeUpdate();
			
			System.out.println(result+"명 삭제");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(con != null ){
					con.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}//try~catch end
		
	}//main() end
	
}//JDBCEx4 end

