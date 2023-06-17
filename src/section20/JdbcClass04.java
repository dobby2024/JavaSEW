package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass04 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement ������� ���� PreparedStatement �������!!!!!!!!!
		PreparedStatement pstmt =null;
		boolean isSuccess = false;
		
		try {
			// 1. ����̹� Ŭ���� ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// Ʈ����� ����
			conn.setAutoCommit(false);
			
			// 3. ���� �ۼ�
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (3, '�ߵ���', 300, 0.3)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (4, '������', 400, 0.3)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (5, '�ǰ���', 500, 0.1)"
					);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(
					"INSERT INTO sales_reps VALUES (6, '�Ḹ��', 600, 0.7)"
					);
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(isSuccess) {
				conn.commit();	// Ʈ������� ����ó�� �Ǿ��� ��� ��� ����
			} else {
				conn.rollback();	// Ʈ������� ����ó�� ���� �ʾ��� ��� ��� ���
			}
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}

}
