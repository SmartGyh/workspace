package moveZero;

public class MoveZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void moveZeros(int[] nums){
		int index = -1;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == 0 && index == -1){
				index = i;
			}
			if(nums[i] != 0 && index == -1){
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index ++;
			}
//			if(nums[])
		}
	}

}
