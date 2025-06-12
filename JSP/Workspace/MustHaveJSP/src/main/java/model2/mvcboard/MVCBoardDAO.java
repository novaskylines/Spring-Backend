package model2.mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.DBConnPool;

public class MVCBoardDAO extends DBConnPool {
	
	public int selectCount(Map<String,Object> map) {
		int totalCount = 0;
		try {
			String query = "SELECT COUNT(*) FROM mvcboard";
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
	
	public List<MVCBoardDTO> selectListPage(Map<String,Object> map) {
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>();
		try {
			String query = "SELECT * FROM (SELECT Tb.*, ROWNUM rNum FROM (SELECT * FROM mvcboard ";
			if (map.get("searchWord") != null) {
				query += " WHERE " + map.get("searchField") + " LIKE '%" + map.get("searchWord") + "%' ";
			}
			query += "ORDER BY idx DESC ) Tb ) WHERE rNum BETWEEN ? AND ?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
													rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
				board.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int insertWrite(MVCBoardDTO dto) {
		int result = 0;
		try {
			String query = "INSERT INTO mvcboard (idx, name, title, content, ofile, sfile, pass) VALUES (seq_board_num.NEXTVAL,?,?,?,?,?,?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			psmt.setString(6, dto.getPass());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public MVCBoardDTO selectView(int idx) {
		MVCBoardDTO dto = null;
		try {
			String query = "SELECT * FROM mvcboard WHERE idx=?";
			psmt = con.prepareStatement(query);
			psmt.setInt(1, idx);
			rs = psmt.executeQuery();
			if (rs.next()) {
				dto = new MVCBoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
										rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void updateVisitCount(int idx) {
		try {
			String query = "UPDATE mvcboard SET visitcount=visitcount+1 WHERE idx=?";
			psmt = con.prepareStatement(query);
			psmt.setInt(1, idx);
			psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void downCountPlus(int idx) {
		try {
			String sql = "UPDATE mvcboard SET downcount=downcount+1 WHERE idx=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, idx);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean confirmPassword(String pass, int idx) {
		boolean isCorr = true;
		try {
			String sql = "SELECT COUNT(*) FROM mvcboard WHERE pass=? AND idx=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setInt(2, idx);
			rs = psmt.executeQuery();
			rs.next();
			if (rs.getInt(1)==0) {
				isCorr = false;
			}
		} catch (Exception e) {
			isCorr = false;
			e.printStackTrace();
		}
		return isCorr;
	}
	
	public int deletePost (int idx) {
		int result = 0;
		try {
			String query = "DELETE FROM mvcboard WHERE idx=?";
			psmt = con.prepareStatement(query);
			psmt.setInt(1, idx);
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int updatePost(MVCBoardDTO dto) {
		int result = 0;
		try {
			String query = "UPDATE mvcboard SET title=?, name=?, content=?, ofile=?, sfile=? WHERE idx=? and pass=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			psmt.setInt(6, dto.getIdx());
			psmt.setString(7, dto.getPass());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
