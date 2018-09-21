import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class File_io {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入文件路径");
		String path = sc.nextLine();
		File f = new File(path);
		try {
			InputStream is = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String name = br.readLine();
			String age = br.readLine();
			String sex = br.readLine();
			
			System.out.println(name);
			System.out.println(age);
9			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		InputStream is = f;
			
	}

}
