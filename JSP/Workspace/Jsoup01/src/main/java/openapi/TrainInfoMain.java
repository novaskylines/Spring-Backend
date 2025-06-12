package openapi;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TrainInfoMain {

	public static void main(String[] args) {

		try {
			List<Map> parsedCity = parseXML(getConnection(getURLViewCity("xml")));
			System.out.println(parsedCity);
			List<Map> parsedCity2 = parseJson(getConnection(getURLViewCity("json")));
			System.out.println(parsedCity2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 도시 일람의 URL
	public static String getURLViewCity(String type) {

		TrainInfo ti = new TrainInfo();
		StringBuilder urlBuilder = null;

		try {
			urlBuilder = new StringBuilder("http://apis.data.go.kr/1613000/TrainInfoService/getCtyCodeList");
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + ti.serviceKey);
			urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "=" + URLEncoder.encode(type, "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return urlBuilder.toString();
	}

	// 도시별 역 일람의 URL
	public static String getURLViewStation(String cityCode) {

		TrainInfo ti = new TrainInfo();
		StringBuilder urlBuilder = null;

		try {
			urlBuilder = new StringBuilder("http://apis.data.go.kr/1613000/TrainInfoService/getCtyAcctoTrainSttnList");
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + ti.serviceKey);
			urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));
			urlBuilder
					.append("&" + URLEncoder.encode("cityCode", "UTF-8") + "=" + URLEncoder.encode(cityCode, "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return urlBuilder.toString();
	}

	// 기차 일람의 URL
	public static String getURLViewTrain() {

		TrainInfo ti = new TrainInfo();
		StringBuilder urlBuilder = null;

		try {
			urlBuilder = new StringBuilder("http://apis.data.go.kr/1613000/TrainInfoService/getVhcleKndList");
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + ti.serviceKey);
			urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return urlBuilder.toString();
	}

	// 시작 역, 도착 역, 일자를 이용한 URL 출력
	public static String getURLViewTrip(String depPlaceId, String arrPlaceId, String depPlandTime) {

		TrainInfo ti = new TrainInfo();
		StringBuilder urlBuilder = null;

		try {
			urlBuilder = new StringBuilder(
					"http://apis.data.go.kr/1613000/TrainInfoService/getStrtpntAlocFndTrainInfo"); /* URL */
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + ti.serviceKey);
			urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
					+ URLEncoder.encode("100", "UTF-8")); /* 한 페이지 결과 수 */
			urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "="
					+ URLEncoder.encode("xml", "UTF-8")); /* 데이터 타입(xml, json) */
			urlBuilder.append("&" + URLEncoder.encode("depPlaceId", "UTF-8") + "="
					+ URLEncoder.encode(depPlaceId, "UTF-8")); /* 출발기차역ID [상세기능3. 시/도별 기차역 목록조회]에서 조회 가능 */
			urlBuilder.append("&" + URLEncoder.encode("arrPlaceId", "UTF-8") + "="
					+ URLEncoder.encode(arrPlaceId, "UTF-8")); /* 도착기차역ID [상세기능3. 시/도별 기차역 목록조회]에서 조회 가능 */
			urlBuilder.append("&" + URLEncoder.encode("depPlandTime", "UTF-8") + "="
					+ URLEncoder.encode(depPlandTime, "UTF-8")); /* 출발일(YYYYMMDD) */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return urlBuilder.toString();
	}

	// URL을 이용한 GET 연결
	public static String getConnection(String urlString) throws IOException {

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

	// XML 파싱
	public static List<Map> parseXML(String document) {

		List<Map> returnList = new ArrayList<Map>();

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			InputStream is = new ByteArrayInputStream(document.getBytes());
			Document doc = builder.parse(is);

			Element root = doc.getDocumentElement();
			NodeList nlist = root.getElementsByTagName("item");

			for (int i = 0; i < nlist.getLength(); i++) {
				Node node = nlist.item(i);
				NodeList childNodeList = node.getChildNodes();
				Map<String, String> parseMap = new HashMap<String, String>();

				for (int j = 0; j < childNodeList.getLength(); j++) {
					Node child = childNodeList.item(j);
					String nName = child.getNodeName();
					String nValue = child.getTextContent();
					parseMap.put(nName, nValue);
					System.out.println(nName + " : " + nValue);
				}
				returnList.add(parseMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnList;
	}

	// JSON 파싱
	public static List<Map> parseJson(String document) {

		List<Map> returnList = new ArrayList<Map>();

		try {
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(document);
			JSONObject jsonResponse = (JSONObject) jo.get("response");
			JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
			JSONObject jsonItems = (JSONObject) jsonBody.get("items");
			JSONArray jsonItem = (JSONArray) jsonItems.get("item");

			for (Object obj : jsonItem) {
				JSONObject jsonObj = (JSONObject) obj;
				Iterator<String> keySet = jsonObj.keySet().iterator();
				Map<String, String> objMap = new HashMap<String, String>();
				for (int i = 0; i < jsonObj.size(); i++) {
					String key = keySet.next();
					String val = jsonObj.get(key).toString();
					objMap.put(key, val);
					System.out.println(key + " : " + val);
				}
				returnList.add(objMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnList;
	}

}
