import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ChatServer implements Runnable{
	Socket socket ;
	public void Chatserver(Socket socket){
		this.socket = socket;
	}
	
	public void out(String out){
		try {
			socket.getOutputStream().write(out.getBytes("UTF-8"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
