import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerListener implements Runnable {

	
	public void run() {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			
			while(true){
				Socket socket = serverSocket.accept();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
