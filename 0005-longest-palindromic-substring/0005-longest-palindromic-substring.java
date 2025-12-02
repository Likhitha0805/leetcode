class Solution {
    public String longestPalindrome(String s) {
     int n=s.length();
     int max=0;
     int start=0;
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(j-i+1>max&&isPalindrome(s,i,j)){
                start=i;
                max=j-i+1;
            }
        }
     }
     return s.substring(start,start+max);
    }
    public static boolean isPalindrome(String s,int l,int r){
        boolean palindrome=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

            