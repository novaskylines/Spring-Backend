package chapter24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (InputStream in = new FileInputStream("data.txt")) {
			// 글자 하나를 읽어 int값으로 돌려준다
			int dat = in.read();
			// 그낭 출력하면 int로 출력
			System.out.println(dat);
			// 포맷팅으로 char로 바꿔서 출력
			System.out.printf("%c \n", dat);
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
