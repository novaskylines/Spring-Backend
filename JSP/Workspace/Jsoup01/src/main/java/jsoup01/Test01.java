package jsoup01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test01 {

	public static void main(String[] args) {

		String strHtml = "<!DOCTYPE html>"
			+ "<html>"
	        + "<head>"
	        + "<title>JSoup Example</title>"
	        + "</head>"
	        + "<body>"
	        + "<table><tr><td><h1>HelloWorld</h1></tr>"
	        + "</table>"
	        + "</body>"
	        + "</html>";
		
		
		
		Document html = Jsoup.parse(strHtml);
		String title = html.title();
		String h1 = html.body().getElementsByTag("h1").text();
		
		System.out.println(title+"\n"+"먹냐~");
		System.out.println(h1);
		
		
		
	}

}
