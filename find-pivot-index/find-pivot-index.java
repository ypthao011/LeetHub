class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        //finds sum of list, also a placeholder for right side pivot
        for(int i: nums){
            rightSum += i;
        }
        
        //start conditions
        //we always start on [0]
        int leftSum = nums[0];
        //[0] is removed from righ pivot sum
        rightSum -= nums[0];
        //check condition for position[0] and rightpivot sum ==0
        if(rightSum == 0){
            return 0;
        }
        //if the check passes we can move the pivot marker to position [1]
        rightSum -= nums[1];
        //j start at position 1 because left always start with [0]
        for(int j = 1; j< nums.length-1; j++){
            //check condition for rightsum pivot            
            if(leftSum == rightSum){
                return j;
            }
            
            leftSum += nums[j];
            rightSum -= nums[j+1];
            
            //this condition is for when we reach length, to avoid out of bounds 
            if(leftSum == rightSum){
                return j+1;
            }
        }
        
         return -1;
    }
}