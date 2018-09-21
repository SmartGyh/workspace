import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class SocketClient {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1",8888);
		
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		while (true) {
			Scanner sc = new Scanner(System.in);
			String send_msg = sc.nextLine();
			dos.writeUTF(send_msg);
			
			String read_msg = dis.readUTF();
			System.out.println("收到服务端信息：" + dis.readUTF());
		}
		
	}

}
