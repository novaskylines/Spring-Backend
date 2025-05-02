package chapter24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Ex06_FileCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열, 이미지 등 어떤 파일이든지 복사 가능
		String src = "./src/chapter24/24.입출력 스트림.pptx";
		String dst = "24.입출력 스트림copy2.pptx";
		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
			
			// byte 자료형의 배열을 선언
			byte[] buf = new byte[1024];
			int len;
			
			Instant start = Instant.now();
			while (true) {
				// read(바이트 배열)을 통해 바이트 배열의 크기만큼 읽음: 읽는 속도 증가
				len = in.read(buf);
				if (len == -1) {
					break;
				}
				// 저장할 데이터, 시작 인덱스, 실제 출력할 데이터
				out.write(buf, 0, len);
			}
			Instant end = Instant.now();
			System.out.println("복사에 걸린 시간: " + Duration.between(start, end).toMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
