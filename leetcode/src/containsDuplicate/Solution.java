package containsDuplicate;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
          for (int j = i - 1; j >= 0; j--) {
              if(nums[i] > nums[j])
              {
                  break;
              }
              else if(nums[i] == nums[j])
              {
                  return true;
              }
          }

      }
      return false;
    }
    public static void main(String[] args) {
    	int nums[] = {1,6,2,6};
		System.out.println(containsDuplicate(nums));
	}
}