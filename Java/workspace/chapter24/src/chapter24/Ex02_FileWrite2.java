package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_FileWrite2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream out = null;
		try {
			// 입출력 스트림은 실행을 위해서 반드시 throw 또는 예외처리를 반드시 실행해야한다.
			// 하지 않을 시 실행이 불가능하므로 반드시 예외처리를 하자
			out = new FileOutputStream("data.txt");
			out.write(65);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 입출력 스트림이 만들어져 있는지 확인
			// 스트림이 null인 상태로 close를 실행하려 하면 에러가 발생
			if(out!=null) {
				// null인 경우 에러가 발생하므로 try/catch 문 다시 사용해야함
				try {
					out.close();
				} catch(IOException e2) {
					e2.printStackTrace();
				}
			}
		}

	}

}
