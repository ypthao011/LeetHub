class Solution {
    public int removeDuplicates(int[] nums) {
        //start at position 1, nums[0] is the first occurance
        //if nums[i] is == nums i -1, 
        int l= 1;
        for(int r=1; r<nums.length; r++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}