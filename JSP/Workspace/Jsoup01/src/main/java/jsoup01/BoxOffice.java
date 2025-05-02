package jsoup01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BoxOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B0%95%EC%8A%A4%EC%98%A4%ED%94%BC%EC%8A%A4&ackey=p5qj0vqm";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select("._panel_popular ._panel .item");
		
		for (Element element: elements) {
			String img = element.select("img").first().absUrl("src");
			String name = element.getElementsByClass("name").text();
			String subtext = element.getElementsByClass("sub_text").text();
			
//			System.out.println(element);
			System.out.println(img);
			System.out.println(name);
			System.out.println(subtext);
			
		}
		

	}

}
