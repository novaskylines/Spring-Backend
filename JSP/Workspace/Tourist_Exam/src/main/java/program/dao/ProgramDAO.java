package program.dao;

import java.util.ArrayList;
import java.util.List;

import common.DBConnPool;
import program.dto.ProgramDTO;

public class ProgramDAO extends DBConnPool {
	
	public List<ProgramDTO> readPrograms() {
		List<ProgramDTO> programList = null;
		try {
			String query = "SELECT * FROM program ORDER BY no ASC";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			programList = new ArrayList<ProgramDTO>();
			while (rs.next()) {
				programList.add(new ProgramDTO(rs.getInt("no"), rs.getString("title"), rs.getString("text"), 
						rs.getString("subtext"), rs.getString("schedule"), rs.getString("img"), rs.getDate("create_date")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return programList;
	}

}
