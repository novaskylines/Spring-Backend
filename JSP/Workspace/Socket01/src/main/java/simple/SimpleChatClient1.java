package simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SimpleChatClient1 {

	Socket socket;
	BufferedReader keyReader;
	BufferedWriter bw;
	BufferedReader socReader;

	public void initClient() {
		try {
			socket = new Socket("localhost", 8090);
			System.out.println("SimpleChatClient1 : Connected.");
			
			// 서버로 보내는 것들
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// readLine() : 여기서 한 줄 입력할 때 까지 대기.
			System.out.println("SimpleChatClient1 : Waiting input...");
			String input = keyReader.readLine();
			System.out.println("SimpleChatClient1 : readLine() complete.");
			bw.write(input);
			bw.newLine();
			bw.flush();
			
			// 서버에서 받아오는 것들
			socReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
//			String line;
			System.out.println("SimpleChatClient1 : Waiting incoming message...");
			
//			while ((line = socReader.readLine()) != null) {
//				System.out.println("수신 메시지: "+ line);
//			}
			System.out.println("SimpleChatClient1 : " + socReader.readLine());
			
			socket.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		SimpleChatClient1 scc1 = new SimpleChatClient1();
		scc1.initClient();

	}

}
