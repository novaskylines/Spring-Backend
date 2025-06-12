package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

// 서버/클라이언트에서 불러오는 메서드, 메인 메서드가 없음
// 소켓만을 관리하기 위해 만드는 객체

public class SocketClient {

	// class ChatServer를 관리하기 위해서 필요
	ChatServer chatServer;

	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress info = (InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = info.getHostString();
			recieve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void recieve() {
		
		chatServer.threadPool.execute(() -> {
			while (true) {
				try {
					// DataInputStream에서 보낼 메세지를 읽는다
					String recieveJson = dis.readUTF();
					// jsonObj : 메세지를 받는 역할과 클라이언트를 받는 역할을 함께 한다
					JSONObject jsonObj = new JSONObject(recieveJson);
					String cmd = jsonObj.getString("cmd");
					if (cmd.equals("incoming")) {
						this.chatName = jsonObj.getString("data");
						chatServer.sendToAll(SocketClient.this, chatName+"님이 들어왔습니다.");
						chatServer.addSocketClient(this);
					} else if (cmd.equals("message")) {
						String message = jsonObj.getString("data");
						// sendToAll : 메세지를 보내는 메서드
						chatServer.sendToAll(SocketClient.this, message);	
					}
				} catch (IOException e) {
					chatServer.sendToAll(SocketClient.this, chatName + "가 나갔어요.");
					chatServer.removeSocketClient(SocketClient.this);
					break;
				}
			}
		});
	}


}
