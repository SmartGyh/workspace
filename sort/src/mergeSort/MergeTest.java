package mergeSort;

import java.util.Scanner;

public class MergeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		MergeSort m = new MergeSort(level);
		for(int i = 0;i < 100;i++) {
			m.insert((int)(Math.random()*level*2));
		}
		System.out.println("排序前：");
		m.display();
		m.mergeSort();
		System.out.println("排序后：");
		m.display();
	}

}
