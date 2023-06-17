package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcClass06 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement ������� ���� PreparedStatement �������!!!!!!!!!
		PreparedStatement pstmt =null;
		
		try {
			// 1. ����̹� Ŭ���� ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			StringBuffer sql = new StringBuffer();
			
			// 3. ���� �ۼ�
			sql.append("DELETE FROM sales_reps ");
			sql.append("WHERE id = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 5);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("������ DELETE("+result+") ����!");
			} else {
				System.out.println("DELETE("+result+")  �����Ͱ� �����ϴ�.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
}
