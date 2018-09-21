class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int results[] = new int[2];
        for(int i = 0;i < nums.length;i++){
//            if(nums[i]>target)
//                continue;
            for(int j = i+1;j < nums.length;j++){
//                if(nums[j]>target)
//                    continue;
                if(nums[i]+nums[j]==target){
                  results[0] = i;
                  results[1] = j;
                  System.out.println("i:"+i+" j:"+j);
                  return results;
                }
            }
        }
        return results;
    }
    public static void main(String[] args) {
    	int nums[]={-3,4,3,90};
    	int result[] = twoSum(nums, 0);
		System.out.println(result[0]+","+result[1]);
		System.out.println(nums[result[0]]+"  "+nums[result[1]]);
	}
}