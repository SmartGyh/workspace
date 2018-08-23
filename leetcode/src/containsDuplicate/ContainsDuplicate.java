package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
	}
    public static boolean containsDuplicate(int[] nums){
    	Set<Integer> set = new HashSet<>();
    	boolean flag = false;
    	for(int i = 0;i < nums.length;i++){
    		if(!set.contains(nums[i])){
    			set.add(nums[i]);
    		}else{
    			flag = true;
    		}
    	}
    	
    	return flag;
    }
}
