package jsoup01;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test02 {

	public static void main(String[] args) {

//		String url = "https://news.sbs.co.kr/news/newsSection.do?sectionType=02&plink=GNB&cooper=SBSNEWS";
		String url = "https://m.search.daum.net/nate?w=tot&q=%EC%98%81%ED%99%94%EC%88%9C%EC%9C%84&DA=MOR&rtmaxcoll=MOR";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		w_news_list type_issue2
		
//		Elements elements = doc.select(".w_news_list > ul > li");
//		Elements elements = doc.select(".nm-content-horizontal-row-item-container > li");
		
		Elements elements = doc.select(".c-list-basic.ty_flow35 > li");
//		Elements elems = elements.select(".nm-content-horizontal-row > ul > li");
//		Elements elements = doc.select(".nm-content-horizontal-row-item-container > li");
		
		String sub = "";
		String read = "";
		String date = "";
		int i = 0;
		for (Element element : elements) {
//			sub = element.getElementsByClass("sub").text();
//			read = element.getElementsByClass("read").text();
//			date = element.getElementsByClass("date").text();
			date = element.select(".item-title").text();
					
//			System.out.println(sub+"\n-"+read+"\n-"+date);
			System.out.println(++i +date);
		}
		
	}

}
