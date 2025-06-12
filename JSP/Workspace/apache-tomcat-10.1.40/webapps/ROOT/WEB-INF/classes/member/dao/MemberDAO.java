package member.dao;

import java.util.ArrayList;
import java.util.List;

import common.DBConnPool;
import member.dto.MemberDTO;

public class MemberDAO extends DBConnPool {
	
	public MemberDAO() {
		super();
	}
	
	// CRUD: Create, Read, Update, Delete
	
	public void addMember(String id, String email, String name, String password, String phone, String gender, int agree,
			String content) {
		try {
			String sql = "INSERT INTO tourist_member(id, email, name, password, phone, gender, agree, content, regidate) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, email);
			psmt.setString(3, name);
			psmt.setString(4, password);
			psmt.setString(5, phone);
			psmt.setString(6, gender);
			psmt.setInt(7, agree);
			psmt.setString(8, content);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemberDTO getMember(String id, String password) {
		MemberDTO dto = null;
		try {
			String sql = "SELECT * FROM tourist_member WHERE id=? AND password=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, password);
			rs = psmt.executeQuery();
			if (rs.next()) {
				dto = new MemberDTO(rs.getString("id"), rs.getString("email"), rs.getString("name"),
									rs.getString("password"), rs.getString("phone"), rs.getString("gender"),
									rs.getInt("agree"), rs.getString("content"), rs.getString("regidate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<MemberDTO> getMemberList() {
		List<MemberDTO> memberList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM tourist_member";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("email"), rs.getString("name"),
											  rs.getString("password"), rs.getString("phone"), rs.getString("gender"),
											  rs.getInt("agree"), rs.getString("content"), rs.getString("regidate"));
				memberList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberList;
	}
	
	public void updateMember(String id, String email, String name, String password, String phone, String gender, String content) {
		try {
			String sql = "UPDATE member SET email=?, name=?, password=?, phone=?, gender=?, content=? WHERE id=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, email);
			psmt.setString(2, name);
			psmt.setString(3, password);
			psmt.setString(4, phone);
			psmt.setString(5, gender);
			psmt.setString(6, content);
			psmt.setString(7, id);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMember(String id, String password) {
		try {
			String sql = "DELETE FROM member WHERE id=? AND password=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, password);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
