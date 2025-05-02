package chapter24;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Reader in = new FileReader("text.txt")){
			int ch;
			while(true) {
				// 글자를 하나씩 읽음
				ch = in.read();
				// -1: 글자가 없을 경우 중지
				if(ch == -1) {
					break;
				}
				// 글자를 출력
				System.out.print((char)ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
