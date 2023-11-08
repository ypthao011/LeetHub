class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int current = 0;

        char[] stringArray = s.toCharArray();
        ArrayList<Character> tracker = new  ArrayList<Character>();

        for(int left =0, right = 0; right < stringArray.length; right++){
            if(!tracker.contains(stringArray[right]) || tracker.isEmpty()){
                tracker.add(stringArray[right]);
                current++;
            } else {
                left++;
                right = left;
                current = 1;
                tracker.clear();
                tracker.add(stringArray[right]);
            }

            if(current > longest){
                longest = current;
            }
        }

        return longest;
    }
}