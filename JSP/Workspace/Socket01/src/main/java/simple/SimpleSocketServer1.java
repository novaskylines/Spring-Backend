package simple;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer1 {

	public static void main(String[] args) {
		try {
			// serversocket : 소켓보다는 소켓을 만들어주는 녀석에 가까움
			ServerSocket serversocket = new ServerSocket(8888);
			System.out.println("서버 소켓 접속했음.");
			// 얘는 진짜 소켓
			Socket clientsocket = serversocket.accept();
			System.out.println("클라이언트 소켓 accepted.");
			BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
			
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println("수신 메세지 : "+ line);
			}
			serversocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
