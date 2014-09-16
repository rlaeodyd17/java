package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import util.ConnectionUtil;

public class JDBCEx3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("============학생관리프로그램ver0.99=================");
		
		System.out.println("이름을 입력하세요~");
		
		String name = scan.nextLine();
		
		System.out.println("태어난 년도를 4자리로 입력해 주세요~ ");
		
		String year = scan.nextLine();
		
		System.out.println("태어난 월을 입력해 주세요~ ");
		
		String month = scan.nextLine();
		
		System.out.println("태어난 날을 입력해 주세요~ ");
		
		String day = scan.nextLine();
		
		Date birth = Date.valueOf(year+"-"+month+"-"+day); //Date객체는 스테틱
		
		System.out.println("키를 입력해주세요~~");
		
		int height = scan.nextInt();
		
		scan.close();
		
		//Connection 객체
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO students (no,name,birth_date,height)";
		sql += "VALUES (students_seq.nextval,?,?,?)";
		
		System.out.println(sql);
		
		try {
			con = ConnectionUtil.getConnection();
			
			//준비된구문 준비
			pstmt = con.prepareStatement(sql);
			
			//?? 바인딩
			pstmt.setString(1, name);
			pstmt.setDate(2, birth);
			pstmt.setInt(3, height);
			
			//수행
			int result = pstmt.executeUpdate();
			
			System.out.println(result+ "명의 학생등록 완료!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e){
				
			}
		}
		
	}//main() end
	
}//JDBCEx3 end
