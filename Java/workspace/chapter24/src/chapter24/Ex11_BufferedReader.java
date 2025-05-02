package chapter24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
			String str;
			while(true) {
				// readLine: 한줄을 읽음
				str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
