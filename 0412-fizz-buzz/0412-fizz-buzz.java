class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> finalString = new ArrayList<String>();
        
        int i = 1;
        while( i <= n){
            if(i%3==0 && i%5==0){
                finalString.add("FizzBuzz");
            }
            else if(i%3==0){
                finalString.add("Fizz");
            }
            else if(i%5==0){
                finalString.add("Buzz");
            }
            else{
                finalString.add(String.valueOf(i));
            }
            i++;
        }
        
        return finalString;
    }
}