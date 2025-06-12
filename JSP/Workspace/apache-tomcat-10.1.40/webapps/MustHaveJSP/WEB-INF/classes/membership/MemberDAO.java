package membership;

import java.util.ArrayList;
import java.util.List;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{
	
	// 회원을 모두 가져오는 메서드
	public List<MemberDTO> getMemberList() {
		List<MemberDTO> memberList = new ArrayList<>();
		String query = "SELECT id, pass, name, regidate FROM member";
		try {
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
				member.setName(rs.getString("name"));
				member.setRegidate(rs.getString("regidate"));
				memberList.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberList;
	}
	
	// CRUD: 검색, 추가, 설정, 삭제!
	
	// 회원 한명의 데이터를 SELECT하는 메서드
	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO();
		String query = "SELECT * FROM member WHERE id=? AND pass=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();
			// 결과가 1개이면 반복문을 사용하지 않음
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setRegidate(rs.getString("regidate"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
//	회원 삭제 메서드
	public void deleteMember(String id, String pass) {
		try {
			String query = "DELETE FROM member WHERE id=? and pass=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 회원 추가 메서드
	public void insertMember(String id, String pass, String name) {
		try {
			String query = "INSERT INTO member(id,pass,namne) VALUES (?,?,?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			psmt.setString(3, name);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 회원 정보 갱신 메서드
	public void updateMember(String id, String pass, String name) {
		try {
			String query = "UPDATE member SET pass=?, name=? WHERE id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, pass);
			psmt.setString(2, name);
			psmt.setString(3, id);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



















