package chapter;

public class Mult {
	public static void main(String[] args) {
		System.out.println(mult(3,5));
	}
	
	public static int mult(int a,int b) {//b为需要运行的次数
		if(b == 1) {
			return a;
		}else {
			return mult(a+a,b-1);
		}
	}
}
