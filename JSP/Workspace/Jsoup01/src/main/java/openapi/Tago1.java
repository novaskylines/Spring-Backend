package openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Tago1 {

	public static void main(String[] args) throws IOException {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1613000/TrainInfoService/getStrtpntAlocFndTrainInfo"); /*URL*/
		urlBuilder.append("?"+ URLEncoder.encode("serviceKey","UTF-8") +"="+"uDZq2pbS7g7A4so5ItYt%2FsCHAgMOeRNNOg27cjP3hnQ4ZisoZygPHdYqeKjAvZ63KxHcVdr1dpmPTjpLQLGMdg%3D%3D");
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*데이터 타입(xml, json)*/
        urlBuilder.append("&" + URLEncoder.encode("depPlaceId","UTF-8") + "=" + URLEncoder.encode("NAT010000", "UTF-8")); /*출발기차역ID [상세기능3. 시/도별 기차역 목록조회]에서 조회 가능*/
        urlBuilder.append("&" + URLEncoder.encode("arrPlaceId","UTF-8") + "=" + URLEncoder.encode("NAT011668", "UTF-8")); /*도착기차역ID [상세기능3. 시/도별 기차역 목록조회]에서 조회 가능*/
        urlBuilder.append("&" + URLEncoder.encode("depPlandTime","UTF-8") + "=" + URLEncoder.encode("20230403", "UTF-8")); /*출발일(YYYYMMDD)*/
        urlBuilder.append("&" + URLEncoder.encode("trainGradeCode","UTF-8") + "=" + URLEncoder.encode("00", "UTF-8")); /*차량종류코드*/
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.addRequestProperty("Content-type", "application/json");
        System.out.println(conn.getResponseCode());
        

        BufferedReader br = null;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
        
        StringBuilder sb = new StringBuilder();
        String line = "";
        
        while ((line = br.readLine()) != null) {
        	sb.append(line);
		}
        br.close();
        conn.disconnect();
        
        System.out.println(sb.toString());
		
	}

}
