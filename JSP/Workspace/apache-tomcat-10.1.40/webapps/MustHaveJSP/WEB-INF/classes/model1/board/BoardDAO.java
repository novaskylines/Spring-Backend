package model1.board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnect;

public class BoardDAO extends JDBConnect {

	public BoardDAO() {
		super();
	}

	// Create
	
	public int insertWrite(BoardDTO dto) {
		int result = 0;
		try {
			String query = "INSERT INTO board(num, title, content, id, visitcount) "
					+ "VALUES (seq_board_num.nextval, ?, ?, ?, 0)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Read

	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;

		String query = "SELECT COUNT(*) FROM board";

		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWord") + "%'";
		}

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		} catch (Exception e) {
			System.out.println("BoardDAO.selectCount에서 예외 발생");
			e.printStackTrace();
		}

		return totalCount;
	}

	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<>();
		String query = "SELECT * FROM board";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWord") + "%'";
		}
		query += " ORDER BY num DESC";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"), rs.getString("title"), rs.getString("content"), 
						 					rs.getString("id"), rs.getDate("postdate"), rs.getInt("visitcount"));
				bbs.add(dto);
			}

		} catch (Exception e) {
			System.out.println("BoardDAO.selectList에서 예외 발생");
			e.printStackTrace();
		}
		return bbs;
	}
	
	public List<BoardDTO> selectListPage(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<>();
		try {
			String query = "SELECT * FROM (SELECT Tb.*, ROWNUM rNum FROM (SELECT * FROM board ";
			if(map.get("searchWord")!=null) {
				query += " WHERE " + map.get("searchField")
				+ " LIKE '%" + map.get("searchWord") + "%' ";
			}
			query += " ORDER BY num DESC "
					+" ) Tb "
					+" ) "
					+" WHERE rNum BETWEEN ? AND ?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"), rs.getString("title"), rs.getString("content"), 
						 					rs.getString("id"), rs.getDate("postdate"), rs.getInt("visitcount"));
				bbs.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bbs;
	}
	
	public BoardDTO selectView(int num) {
		BoardDTO dto = new BoardDTO();
		String query = "SELECT B.*, M.name "
				+ " FROM member M INNER JOIN board B "
				+ " ON M.id = B.id "
				+ " WHERE num = ?";
		System.out.println(query);
		try {
			psmt = con.prepareStatement(query);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if(rs.next()) {
				dto = new BoardDTO(
						rs.getInt("num"), 
						rs.getString("title"), 
						rs.getString("content"), 
	 					rs.getString("id"), 
	 					rs.getDate("postdate"), 
	 					rs.getInt("visitcount"));
			}
		}catch(Exception e) {
			System.out.println("BoardDAO.selectView에서 예외 발생");
			e.printStackTrace();
		}
		return dto;
	}

	// Update
	
	public int updateVisitCount(int num) {
		int result = 0;
		try {
			String sql = "UPDATE board SET visitcount=visitcount+1 WHERE num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("BoardDAO.updateVisitCount에서 예외 발생");
			e.printStackTrace();
		}
		return result;
	}

	public int updateEdit(BoardDTO dto) {
		int result = 0;
		
		try {
			String query = "UPDATE board SET "
					+ " title=?, content=? "
					+ " WHERE num=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setInt(3, dto.getNum());
			result = psmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("BoardDAO.updateEdit에서 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
	// Delete
	
	public int deletePost(BoardDTO dto) {
		int result = 0;
		try {
			String query = "DELETE FROM board WHERE num=?";
			psmt = con.prepareStatement(query);
			psmt.setInt(1, dto.getNum());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("BoardDAO.deletePost에서 예외 발생");
		}
		return result;
	}

}
