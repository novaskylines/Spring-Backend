package simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleChatServer1 {

	ServerSocket server;
	Socket client;
	BufferedReader br;
	BufferedReader keyReader;
	BufferedWriter bw;
	
	public void initServer() {
		try {
			// 소켓 서버 -> 소켓을 허락(server.accept) -> 소켓이 연결됨
			server = new ServerSocket(8090);
			System.out.println("SimpleChatServer1 : Activated.");
			client = server.accept();
			System.out.println("SimpleChatServer1 : Socket Connected.");
			
			// BufferedReader 통해 스트림으로 바꾸는 이유: 통신 과정을 단순하게 하기 위해서. 스트림이 아닐 경우 16진수 문자로 받아들임.
			// BufferedReader : 클라이언트 소켓에서 서버로 오는 데이터를 스트림 형태로 변환
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// BufferedWriter : 시스템(이클립스/윈도우)에서 나오는 데이터를 스트림 형태로 변환
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println("수신 메시지 : " + line);
//			}
			System.out.println("SimpleChatServer1 : " + br.readLine());
			
			// 서버에서 클라이언트 소켓으로 데이터를 스트링 형태로 내보냄
			System.out.println("SimpleChatServer1 keyReader : Start!");
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("SimpleChatServer1 keyReader : Start!!");
			String serverMsg = "SimpleChatServer1 : "+keyReader.readLine();
			System.out.println("SimpleChatServer1 keyReader : readLine()");
			bw.write(serverMsg);
			bw.newLine();
			bw.flush();
			System.out.println("SimpleChatServer1 bw : flushed.");
			
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		SimpleChatServer1 scs1 = new SimpleChatServer1();
		scs1.initServer();		

	}

}
