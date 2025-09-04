import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxlength=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char currCh=s.charAt(r);
            if(map.containsKey(currCh)){
                l=Math.max(l,map.get(currCh)+1);
            }
            map.put(currCh,r);
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}