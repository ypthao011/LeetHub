class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge nums 2 into nums 1
        //bubble sort 
        
        //iterate through nums 2 into nums1
        for(int i = 0; i < n; i++){
            nums1[i+m] = nums2[i];
        }
        
        //[]
        for(int i =0; i< m+n; i++){
            for(int j = i+1; j< m+n; j++){
                int temp = 0;
                if(nums1[i]>nums1[j]){
                    temp = nums1[j];
                    nums1[j]=nums1[i];
                    nums1[i]=temp;
                }
            }
        }
    }
}