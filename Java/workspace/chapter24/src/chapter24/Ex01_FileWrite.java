package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("data.txt");
		out.write(65);
		out.close();

	}

}
