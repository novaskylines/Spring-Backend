package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	
	// Thread vs Runnable : Thread 클래스는 스레드를 생성하는 직접적인 클래스, Runnable은 스레드 로직, 다른 인터페이스 등을 구현할 때 적절한 인터페이스.
	
	// ConnectionPool : 연결의 집합체. 여러 연결을 동시에 처리해야 할 때 미리 연결을 만들어 두어야 한다. 
	// ThreadPool : 스레드의 집합체. 스레드를 사용하지 않으면 여러 개의 연결이 Accept 단계에서 나아가지 못하기 때문에 지정해줘야 한다.
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	
	// 서버소켓.
	ServerSocket serversocket;
	
	Map<String, SocketClient> chatRoom = new HashMap<String, SocketClient>();

	Thread thread;
	
	public void serverStart() throws IOException {
		serversocket = new ServerSocket(50001);
		
		// serverStart는 무한루프를 사용하고 있으며, serversocket.accept가 실행될 때 까지 무한정 기다려야 하기 때문에 코드가 멈출 수 있음.
		// 코드가 막히는 것을 방지하기 위해 스레드를 사용한다.
		
		// 스레드의 정의 : Thread thread = new Thread(Runnable);
		// Runnable : Lambda 형식으로 정의한다. () -> {} 에서 중괄호 안에 스레드로 사용하고자 하는 코드 삽입.
		thread = new Thread(() -> {
			
			Socket socket;
			try {
				while (true) {
					// serversocket이 accept 될 때 까지 대기한다.
					socket = serversocket.accept();
					// while 루프가 돌 때 마다 하나씩 생성.
					SocketClient sc = new SocketClient(ChatServer.this, socket);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		});
		
		thread.start();
	}
	
	public void addSocketClient(SocketClient sc) {
		String key = sc.chatName+"@"+sc.clientIp;
		// 소켓 클라이언트를 관리하는 부분 작성
		chatRoom.put(key, sc);
		System.out.println("입장 : "+key);
		System.out.println("총 인원 수 : "+chatRoom.size());
	}
	
	public void removeSocketClient(SocketClient sc) {
		String key = sc.chatName+"@"+sc.clientIp;
		chatRoom.remove(key);
		System.out.println("나감 : "+key);
		System.out.println("총 인원 수 : "+chatRoom.size()+"\n");
	}
	
	public void serverStop() {
		try {
			System.out.println("[Server] 서버 종료 시도.");
			serversocket.close();
			threadPool.shutdown();
			Collection<SocketClient> socketClients = chatRoom.values();
			for (SocketClient sc : socketClients) {
				sc.socket.close();
			}
			System.out.println("[Server] 서버 종료됨.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void sendToAll(SocketClient socketClient, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", socketClient.clientIp);
		root.put("chatName", socketClient.chatName);
		root.put("message", message);
		String json = root.toString();
		Collection<SocketClient> socketClients = chatRoom.values();
		for (SocketClient sc : socketClients) {
			sc.send(json);
		}
	}
	
	public static void main(String[] args) {
		
		ChatServer cs = new ChatServer();
		
		try {
			cs.serverStart();
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter.");
			System.out.println("----------------------------------------------------------------");
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				if (sc.nextLine().equals("q")) {
					break;
				}
			}
			
			sc.close();
			cs.serverStop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
