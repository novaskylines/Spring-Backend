package jsoup01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test02 {

	public static void main(String[] args) {
		
		String url = "https://news.sbs.co.kr/news/newsflash.do?plink=SNB&cooper=SBSNEWS";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(doc.text());
		
		// shortcut_list shortcut_item
		
		Elements elements = doc.select(".desc");
		
		System.out.println(elements.toString());
		
		for (Element element : elements) {
			String sub = element.getElementsByClass("sub").text();
			String read = element.getElementsByClass("read").text();
			String date = element.getElementsByClass("date").text();
			System.out.println(sub+"\n"+read+"\n"+date);
		}
		
		String url2 = "https://www.netflix.com/kr/browse/genre/81472392";
		Document doc2 = null;
		
		try {
			doc2 = Jsoup.connect(url2).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements2 = doc2.select(".nm-collections-title-name");
		
		for (Element element2 : elements2) {
			System.out.println(element2.text());
		}

	}

}
