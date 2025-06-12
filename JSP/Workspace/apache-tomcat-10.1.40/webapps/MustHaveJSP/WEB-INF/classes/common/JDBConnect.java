package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public JDBConnect() {
		try {
			// DB에 맞는 클래스 설정
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속할 데이터베이스 주소
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// ID
			String id = "musthave";
			// password
			String pwd = "1234";
			// 데이터베이스 접속
			con = DriverManager.getConnection(url,id,pwd);
			
			System.out.println("DB 연결 성공(기본 생성자)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// JDBC에서 생성된 객체를 종료하는 메서드
	public void close() {
		try {
			// 순서를 반드리 지켜야 한다
			// ResultSet : SELECT문의 결과를 담는 객체
			if (rs!=null) rs.close();
			// Statement : SQL문을 한번만 실행하게 하는 객체
			if (stmt!=null) stmt.close();
			// PreparedStatement : SQL문을 여러번 실행할 수 있는 객체
			if (psmt!=null) psmt.close();
			// DB 접속 객체
			if (con!=null) con.close();
			
			System.out.println("JDBC 자원 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
