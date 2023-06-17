package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass05 {
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
			sql.append("UPDATE sales_reps SET ");
			sql.append("name = '���ڸ�' ");
			sql.append("WHERE id = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 6);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("������ Update ����!");
			} else {
				System.out.println("Update �����Ͱ� �����ϴ�.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
}
