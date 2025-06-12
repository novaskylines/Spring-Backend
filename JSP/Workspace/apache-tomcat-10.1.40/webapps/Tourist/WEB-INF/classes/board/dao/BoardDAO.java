package board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	public List<BoardDTO> readBoardSearchList(String searchTitle) {
		List<BoardDTO> boardList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM tourist_board";
			if (searchTitle != null) {
				sql += " WHERE title LIKE '%" + searchTitle + "%'";
			}
			sql += " ORDER BY num DESC";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"), rs.getString("title"), rs.getString("content"),
						rs.getString("id"), rs.getInt("visitcount"), rs.getDate("postdate"));
				boardList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
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
