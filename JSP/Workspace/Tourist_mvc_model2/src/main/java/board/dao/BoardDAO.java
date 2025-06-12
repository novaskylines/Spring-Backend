package board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import board.dto.BoardDTO;
import common.DBConnPool;

public class BoardDAO extends DBConnPool {

	public BoardDAO() {
		super();
	}

	// Create

	public int createBoard(BoardDTO dto) {
		int result = 0;
		try {
			String sql = "INSERT INTO tourist_board(num, title, content, id, visitcount, postdate) "
					+ "VALUES(seq_tourist_board_num.nextval, ?, ?, ?, 0, sysdate)";
			psmt = con.prepareStatement(sql);
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

	public BoardDTO readBoard(int num) {
		BoardDTO dto = null;
		try {
			String sql = "SELECT * FROM tourist_board WHERE num = ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO(rs.getInt("num"), rs.getString("title"), rs.getString("content"), rs.getString("id"),
						rs.getInt("visitcount"), rs.getDate("postdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<Integer> viewNumList() {
		List<Integer> numList = new ArrayList<Integer>();
		try {
			String query = "SELECT num FROM tourist_board ORDER BY num ASC";
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			while (rs.next()) {
				numList.add(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numList;
	}

	public List<BoardDTO> selectListPage(Map<String,Object> map) {
		List<BoardDTO> board = new Vector<BoardDTO>();
		try {
			String query = "SELECT * FROM (SELECT Tb.*, ROWNUM rNum FROM (SELECT * FROM tourist_board ";
			if (map.get("searchWord") != null) {
				query += " WHERE " + map.get("searchField") + " LIKE '%" + map.get("searchWord") + "%' ";
			}
			query += "ORDER BY num DESC ) Tb ) WHERE rNum BETWEEN ? AND ?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6));
				board.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int selectCount(Map<String,Object> map) {
		int totalCount = 0;
		try {
			String query = "SELECT COUNT(*) FROM tourist_board";
			if(map.get("searchWord") != null) {
				query += " WHERE " + map.get("searchField") + " "
						+" LIKE '%" + map.get("searchWord") + "%'";
			}
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalCount;
	}

	// Update

	public int updateBoard(BoardDTO dto) {
		int result = 0;
		try {
			String sql = "UPDATE tourist_board SET title=?, content=? WHERE num=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setInt(3, dto.getNum());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int updateVisit(int num) {
		int result = 0;
		try {
			String sql = "UPDATE tourist_board SET visitcount=(SELECT visitcount FROM tourist_board WHERE num=?)+1 WHERE num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setInt(2, num);
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Delete

	public int deleteBoard(int num) {
		int result=0;
		try {
			String sql = "DELETE FROM tourist_board WHERE num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
