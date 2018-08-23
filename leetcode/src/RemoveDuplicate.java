import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		while(true){
		    int n = sc.nextInt();
		    if(n == 0){
		 	    break;
		    }
			set.add(n);
		}
		System.out.println(set.toString());
		System.out.println(set.size());
	}

	public static int removeDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		return set.size();
	}

}
