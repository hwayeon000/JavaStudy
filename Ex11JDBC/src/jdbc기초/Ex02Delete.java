package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 데이블에서 삭제하고 싶은 행의 name 입력받자
		System.out.print("삭제하고 싶은 ID의 이름 입력 >> ");
		String name = sc.next();
		
		// 사용자가 입력받은 이름에 해당하는 id, pw, name(개의 행)
		// 삭제하는 JDBC코드 작성
		
		// SQL : delete 데이블명 조건식
		
		// 1. 동적로딩
		// 2. 권한확인(준비물 3개)
		// 3. SQL문 준비
		// 4. 전송
		// 5. 결과 확인
		// 6. 사용한객체 닫아주기
		
		// Delete ---> Select(executeQuery, 커서)
		// [1]학생추가 [2]학생삭제 [3]학생전체조회 [4]프로그램종료
		// MVC
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			String sql = "DELETE FROM join WHERE name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int row = psmt.executeUpdate();

			if (row>0) {
				System.out.println("데이터 삭제 성공");
			} else {
				System.out.println("데이터 삭제 실패");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if (psmt!=null) {
					psmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println();
				e.printStackTrace();
			}
		}
		
		
		
	}

}
