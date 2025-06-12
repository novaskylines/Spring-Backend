package exam0527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class GoToWorkOldManDTO {

	String gugun;
	String bsnsFdate;
	String bsnsMainActvt;
	String bsnsNm;
	String bsnsKind;
	String dataDay;
	String tel;
	String people;
	String performInst;
	String bsnsSdate;

	public GoToWorkOldManDTO() {
		super();
	}

	public GoToWorkOldManDTO(String gugun, String bsnsFdate, String bsnsMainActvt, String bsnsNm, String bsnsKind,
			String dataDay, String tel, String people, String performInst, String bsnsSdate) {
		super();
		this.gugun = gugun;
		this.bsnsFdate = bsnsFdate;
		this.bsnsMainActvt = bsnsMainActvt;
		this.bsnsNm = bsnsNm;
		this.bsnsKind = bsnsKind;
		this.dataDay = dataDay;
		this.tel = tel;
		this.people = people;
		this.performInst = performInst;
		this.bsnsSdate = bsnsSdate;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getBsnsFdate() {
		return bsnsFdate;
	}

	public void setBsnsFdate(String bsnsFdate) {
		this.bsnsFdate = bsnsFdate;
	}

	public String getBsnsMainActvt() {
		return bsnsMainActvt;
	}

	public void setBsnsMainActvt(String bsnsMainActvt) {
		this.bsnsMainActvt = bsnsMainActvt;
	}

	public String getBsnsNm() {
		return bsnsNm;
	}

	public void setBsnsNm(String bsnsNm) {
		this.bsnsNm = bsnsNm;
	}

	public String getBsnsKind() {
		return bsnsKind;
	}

	public void setBsnsKind(String bsnsKind) {
		this.bsnsKind = bsnsKind;
	}

	public String getDataDay() {
		return dataDay;
	}

	public void setDataDay(String dataDay) {
		this.dataDay = dataDay;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getPerformInst() {
		return performInst;
	}

	public void setPerformInst(String performInst) {
		this.performInst = performInst;
	}

	public String getBsnsSdate() {
		return bsnsSdate;
	}

	public void setBsnsSdate(String bsnsSdate) {
		this.bsnsSdate = bsnsSdate;
	}

	public void printAll() {
		StringBuilder resultBuilder = new StringBuilder();
		resultBuilder.append("사업 수행기관 : " + this.getPerformInst() + "\r\n");
		resultBuilder.append("사업명 : " + this.getBsnsNm() + "\t");
		resultBuilder.append("구분 또는 유형 : " + this.getBsnsKind() + "\r\n");
		resultBuilder.append("수행 기관 전화번호 : " + this.getTel() + "\t");
		resultBuilder.append("시행 인원 : " + this.getPeople() + "\r\n");
		resultBuilder.append("주요 활동 내용 : " + this.getBsnsMainActvt() + "\r\n");
		resultBuilder.append("시작일 : " + this.getBsnsSdate() + "\t");
		resultBuilder.append("종료일 : " + this.getBsnsFdate() + "\r\n");
		resultBuilder.append("데이터 제공 구군명 : " + this.getGugun() + "\t");
		resultBuilder.append("데이터 작성 기준일자 : " + this.getDataDay() + "\r\n");
		resultBuilder.append("----------------------------------------------------------------------------");
		System.out.println(resultBuilder.toString());
	}

}

public class GoToWorkOldMan {

	String serviceKey = "Vp4vq1r%2B2DPFqpBPVGc7dzY88rzqqUtkcPR543cPnm1nVm0vPqYBRiU4YyXg1bCmp2pe%2B0lvenhcxts8hnkPxw%3D%3D";

	public static void main(String[] args) {

		GoToWorkOldMan oldMan = new GoToWorkOldMan();

		try {
			String oldManJSON = oldMan.getConnection(oldMan.getURL());
			System.out.println(oldManJSON);
			List<GoToWorkOldManDTO> dtoList = oldMan.parseJSON(oldManJSON);
			int count = 1;
			for (GoToWorkOldManDTO dto : dtoList) {
				System.out.println("일련번호 : " + count);
				dto.printAll();
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getURL() {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/6260000/BusanTblAgedjobStusService/getTblAgedjobStusInfo");
		try {
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=" + this.serviceKey);
			urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + "1");
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "800");
			urlBuilder.append("&" + URLEncoder.encode("resultType", "UTF-8") + "=" + "json");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlBuilder.toString();
	}

	public String getConnection(String urlString) throws IOException {

		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println(conn.getResponseCode());

		BufferedReader br = null;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		StringBuilder sb = new StringBuilder();
		String line = "";

		while ((line = br.readLine()) != null) {
			sb.append(line);
		}

		conn.disconnect();
		br.close();

//		System.out.println(sb.toString());
		return sb.toString();
	}

	public List<GoToWorkOldManDTO> parseJSON(String document) {

		List<GoToWorkOldManDTO> parsedList = new ArrayList<GoToWorkOldManDTO>();

		try {
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(document);
			JSONObject jsonResponse = (JSONObject) jo.get("response");
			JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
			JSONObject jsonItems = (JSONObject) jsonBody.get("items");
			JSONArray jsonItem = (JSONArray) jsonItems.get("item");

			int count = 1;

			for (Object obj : jsonItem) {
				JSONObject jsonObj = (JSONObject) obj;
				GoToWorkOldManDTO dto = new GoToWorkOldManDTO();
//				System.out.println("--------" + " No. " + count + " --------");
				Iterator<String> keySet = jsonObj.keySet().iterator();

				for (int i = 0; i < jsonObj.size(); i++) {
					String key = keySet.next();
					if (jsonObj.get(key) == null) {
						jsonObj.replace(key, "");
					}
				}

				dto.setGugun(jsonObj.get("gugun").toString());
				dto.setBsnsFdate(jsonObj.get("bsnsFdate").toString());
				dto.setBsnsMainActvt(jsonObj.get("bsnsMainActvt").toString());
				dto.setBsnsNm(jsonObj.get("bsnsNm").toString());
				dto.setBsnsKind(jsonObj.get("bsnsKind").toString());
				dto.setDataDay(jsonObj.get("dataDay").toString());
				dto.setTel(jsonObj.get("tel").toString());
				dto.setPeople(jsonObj.get("people").toString());
				dto.setPerformInst(jsonObj.get("performInst").toString());
				dto.setBsnsSdate(jsonObj.get("bsnsSdate").toString());
				parsedList.add(dto);

//				System.out.println(count + " success!!");
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parsedList;
	}

}
