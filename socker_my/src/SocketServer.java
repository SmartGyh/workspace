import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SocketServer {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8888);
		Socket s = server.accept();

		System.out.println("正在监听端口："+server.getLocalPort());
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			String send_msg = sc.nextLine();
			dos.writeUTF(send_msg);
			
			String read_msg = dis.readUTF();
			System.out.println("收到信息: " + read_msg);
		}
				
	}

}
