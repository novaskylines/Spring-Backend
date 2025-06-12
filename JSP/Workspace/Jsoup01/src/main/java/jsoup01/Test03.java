package jsoup01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class ImgLink {
	String name = "";
	String sub_text = "";
	String imgAddr = "";
	
	public void save() throws IOException {
		String fileName = "";
		fileName = name.replace("*", "")
				.replace(":", "") + ".jpg";
		
		URL url = new URL(imgAddr);
		
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("img/"+fileName);
		
		byte[] b = new byte[2048];
		int len;
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		is.close();
		os.close();
	}
	
	public ImgLink(String name, String sub_text, String imgAddr) {
		super();
		this.name = name;
		this.sub_text = sub_text;
		this.imgAddr = imgAddr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub_text() {
		return sub_text;
	}
	public void setSub_text(String sub_text) {
		this.sub_text = sub_text;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		
		String url = "https://ko.wikipedia.org/wiki/%EC%9E%90%EC%B9%B4%EB%A5%B4%ED%83%80_%EC%84%9C%EB%B2%84_%ED%8E%98%EC%9D%B4%EC%A7%80";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".mw-file-description");
		
		String img = "";
		
		for (Element element: elements) {
			img = element.select("img").first().absUrl("src");
			System.out.println(img);
			
			ImgLink mv = new ImgLink("name", "sub-text", img);
			
			System.out.println(mv.getName()+"\n - "+mv.getSub_text()+"\n - "+mv.getImgAddr());
			
			try {
				mv.save();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	
	}

}
