package hadoopDemo;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.hdfs.RemotePeerFactory;

public class HdfsClient {

	public static void main(String[] args) {
		init();
		upload("/home/gyh/log","/");
		
	}
	
	public static FileSystem fs ;
	
	public static void init() {
		Configuration conf = new Configuration();
		URI uri;
		
		try {
			
			uri = new URI("hdfs://192.168.122.146:50070");
			fs = FileSystem.get(uri,conf,"root");
			System.out.println("hdfs初始化成功。。。");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void upload(String s,String d) {
		try {
			Path src = new Path(s);
			Path dst = new Path(d);
			fs.copyFromLocalFile(src, dst);
			System.out.println("已将："+src+"上传到："+dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void listFiles(Path dst) {
//		try {
//			RemoteIterator<LocatedFileStatus> iterator = fs.listFiles(dst, true);
//			LocatedFileStatus listFiles = iterator.;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
}
