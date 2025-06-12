package exam0527;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetQuotes {

	public static void main(String[] args) {
		
		String url = "http://quotes.toscrape.com/";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".quote");
		
		for (Element element: elements) {
			String author = element.getElementsByClass("author").text();
			String text = element.getElementsByClass("text").text();
			System.out.println(author + " : " + text);
		}
		

	}

}
