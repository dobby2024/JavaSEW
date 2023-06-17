package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass04 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 말고 PreparedStatement 사용하자!!!!!!!!!
		PreparedStatement pstmt =null;
		boolean isSuccess = false;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);
			
			// 3. 쿼리 작성
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (3, '야도란', 300, 0.3)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (4, '피존투', 400, 0.3)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (5, '또가스', 500, 0.1)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (6, '잠만보', 600, 0.7)"
					);
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(isSuccess) {
				conn.commit();	// 트랜잭션이 정상처리 되었을 경우 모두 수행
			} else {
				conn.rollback();	// 트랜잭션이 정상처리 되지 않았을 경우 모두 취소
			}
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}

}
