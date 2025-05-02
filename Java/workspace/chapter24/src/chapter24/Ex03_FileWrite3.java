package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_FileWrite3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try-with=resource 문: try(close() 해야하는 클래스를 선언)
		// try 문을 사용할 때 자동으로 close()를 실행해 준다.
		try(OutputStream out = new FileOutputStream("data.txt");) {
			out.write(65);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
