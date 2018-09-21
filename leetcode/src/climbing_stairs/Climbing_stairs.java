package climbing_stairs;

public class Climbing_stairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

	
	public static int climbStairs(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		int n_2 = 1;
		int n_1 = 2;
		int index = 0;
		for(int i = 3;i <= n;i++){
			index = n_1 + n_2;
			n_2 = n_1;
			n_1 = index; 
		}
		
		return index;
	}
	
}
