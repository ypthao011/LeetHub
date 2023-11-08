class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //convert strings into interable array
        //iterate through and count number of letter occurance
        //iterate through again with magazine 
        //if hashmap values are positive then it couldn't make the ransom note

        char[] listRN = ransomNote.toCharArray();
        char[] listM = magazine.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        if(listM.length < listRN.length){
            return false;
        }

        for(char c: listRN){
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c) + 1);
            } else{
                counts.put(c, 1);
                }
        }

        for(char c: listM){
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c) - 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: counts.entrySet()){
            if(entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }

}