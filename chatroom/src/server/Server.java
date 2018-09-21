package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Server implements Runnable{
	
	Socket socket_read;
	Socket socket_write;
	public Server(Socket socket_read,Socket socket_write){
		this.socket_read = socket_read;
		this.socket_write = socket_write;
	}
	
	public void run(){
		try {
			
			DataInputStream dis = new DataInputStream(socket_read.getInputStream());
			String msg = dis.readUTF();
			DataOutputStream dos = new DataOutputStream(socket_write.getOutputStream());
			dos.writeUTF(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
