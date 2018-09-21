package server;

public class ChatServer {		
	public static void main(String[] args) {
		ServerListener sl = new ServerListener();
		Thread thread = new Thread(sl);
		thread.start();
		
	}
	
}
