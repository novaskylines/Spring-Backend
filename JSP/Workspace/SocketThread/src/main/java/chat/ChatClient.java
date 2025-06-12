package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {

	/*
	 * 1.소켓연결 2.아웃풋스트림 3.인풋스트림
	 */

	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;

	public void connect() throws IOException {
		socket = new Socket("LocalHost", 50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[Client] 서버에 연결됨.");
	}

	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}

	public void recieve() {

		Thread thread = new Thread(() -> {
			try {
				while (true) {
					String json = dis.readUTF();
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp + "> " + message);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[Client] 서버에 연결 끊김.");
				System.exit(0);
			}
		});

		thread.start();

	}

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
		try {
			cc.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("대화명 입력 : ");
		cc.chatName = sc.nextLine();
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("cmd", "incoming");
		jsonObj.put("data", cc.chatName);
		try {
			cc.send(jsonObj.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		cc.recieve();

		System.out.println("----------------------------------------------------------");
		System.out.println("보낼 메세지를 입력하고 Enter");
		System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
		System.out.println("----------------------------------------------------------");

		while (true) {
//			System.out.print("메세지 : ");
			String message = sc.nextLine();
			if (message.equals("q")) {
				break;
			} else {
				try {
					jsonObj = new JSONObject();
					jsonObj.put("cmd", "message");
					jsonObj.put("data", message);
					cc.send(jsonObj.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	

		sc.close();
		try {
			cc.socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
