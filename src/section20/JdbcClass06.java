package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcClass06 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 말고 PreparedStatement 사용하자!!!!!!!!!
		PreparedStatement pstmt =null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			StringBuffer sql = new StringBuffer();
			
			// 3. 쿼리 작성
			sql.append("DELETE FROM sales_reps ");
			sql.append("WHERE id = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 5);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("데이터 DELETE("+result+") 성공!");
			} else {
				System.out.println("DELETE("+result+")  데이터가 없습니다.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
}
