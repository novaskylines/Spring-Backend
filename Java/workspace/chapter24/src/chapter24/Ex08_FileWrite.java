package chapter24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Writer out = new FileWriter("text.txt")){
			for(int ch=(int)'A'; ch<(int)('Z'+1); ch++) {
				out.write(ch);
			}
			out.write(13);
			out.write(10);
			for(int ch=(int)'A'; ch<(int)('Z'+1); ch++) {
				out.write(ch+32);
			}
			out.write(13);
			out.write(10);
			
			// 문자열을 직접 저장하는 방식
			out.write("동해물과 백두산이 마르고 닳도록");
			// \r\n 은 엔터를 저장
			out.write("\r\n");
			out.write("하느님이 보우하사 우리나라 만세");
			out.write("\r\n");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
