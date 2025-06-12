package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnPool {
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public DBConnPool() {
		try {
			// 컨텍스트 초기화
			Context initCtx = new InitialContext();
			// 프로젝트 환경 설정
			Context ctx = (Context)initCtx.lookup("java:comp/env");
			// server.xml을 이용해 데이터 소스 생성
			DataSource source = (DataSource)ctx.lookup("dbcp_touristDB");
			// Connection 생성
			con = source.getConnection();
			System.out.println("DB 커넥션 풀 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB 커넥션 풀 연결 실패");
		}
	}
	public void close() {
		try {
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(psmt != null) {psmt.close();}
			if(con != null) {con.close();}
			System.out.println("DB 커넥션 풀 자원 반납");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}









