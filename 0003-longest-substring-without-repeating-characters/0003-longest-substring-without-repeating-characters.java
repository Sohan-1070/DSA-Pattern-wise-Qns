class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
       
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(charMap.containsKey(c)){
                left = Math.max(left,charMap.get(c)+1);
            }

            charMap.put(c,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen; 
    }
}