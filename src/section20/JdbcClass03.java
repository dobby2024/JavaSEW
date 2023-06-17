package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statment 사용하지 않습니다! PreparedStatement 사용하기!
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 작성
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT id, name, salary ");
			sql.append("FROM sales_reps ");
			sql.append("WHERE id = ?");
			sql.append("AND salary >= ?");
			
			// 4. PrepareStatement 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "200");
			
			// 5. 쿼리 수행
			rs = pstmt.executeQuery();
			
			// 6. 실행결과 출력하기
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				
				System.out.println(id+"/"+name+"/"+salary);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}

}
