package fileupload;

import java.util.List;
import java.util.Vector;

import common.DBConnPool;

public class MyFileDAO extends DBConnPool{
	
	public int insertFile(MyFileDTO dto) {
		int applyResult = 0;
		try {
			String query = "INSERT INTO myfile (idx,title,cate,ofile,sfile) VALUES (seq_file_num.NEXTVAL, ?,?,?,?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getCate());
			psmt.setString(3, dto.getOfile());
			psmt.setString(4, dto.getSfile());
			applyResult = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Exception from MyFileDAO.insertFile");
			e.printStackTrace();
		}
		return applyResult;
	}
	
	public List<MyFileDTO> myFileList() {
		List<MyFileDTO> fileList = new Vector<MyFileDTO>();
		try {
			String query = "SELECT * FROM myfile ORDER BY idx DESC";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				MyFileDTO dto = new MyFileDTO(rs.getString(1), rs.getString(2), rs.getString(3),
												rs.getString(4), rs.getString(5), rs.getString(6));
				fileList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return fileList;
	}

}
