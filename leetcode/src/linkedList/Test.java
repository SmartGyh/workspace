package linkedList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		System.out.println(set.add(1));
//		System.out.println(set.add(1));
		
		//位运算
		int arr[] = {1,2,3,2,1};
		int a = 0;
		for(int i = 0;i < arr.length;i++){
			a ^= arr[i];
		}
		System.out.println(a);
		
	}

}
