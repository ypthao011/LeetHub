class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
           for(int i2=i+1; i2<nums.length; i2++){
               if(nums[i] + nums[i2] == target){
                    return new int[]{i, i2};
               }
           }
        }
        return new int[]{};
    }
}