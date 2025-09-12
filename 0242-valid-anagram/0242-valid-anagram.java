import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            char[]charArray1=s.toCharArray();
            char[]charArray2=t.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if(Arrays.equals(charArray1,charArray2))
            {
                return true;
            }
            else{
                return false;
            }
        }

                


            }

        }
    
