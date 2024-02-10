class Solution {
    public int pivotIndex(int[] nums) {
        //add all numbers in list
        //have a marker that moves right
        //while marker < total, move right, decrement from total
        //if marker = total return postion
        //if marker > total break return -1
        //if total = 0 return 0
        int rightSum = 0;
        //finds sum of list, also a placeholder for right side pivot
        for(int i: nums){
            rightSum += i;
        }
        
        //start conditions
        int leftSum = nums[0];
        rightSum -= nums[0];
        if(rightSum == 0){
            return 0;
        }
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