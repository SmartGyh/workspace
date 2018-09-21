package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		String name = host.getHostName();
		System.out.println("ip: "+ip);
		System.out.println("name: "+name);
	}

}
