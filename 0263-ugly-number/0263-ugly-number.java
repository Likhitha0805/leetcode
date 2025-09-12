
class Solution {
    public boolean isUgly(int n) {
       
        int[]factors={2,3,5};
       
        if(n<=0){
            return false ;
        }
        for(int factor:factors){
            while(n%factor==0){
                n/=factor;

            }
        }
        return n==1; 
        
        
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        
        int[] testNumbers = {1, 6, 14, 30, 0, -5, 25, 7};
        for (int n : testNumbers) {
            System.out.println( sol.isUgly(n));
        }
    }
}