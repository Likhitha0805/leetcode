import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
       int m=nums.length;
       int maxwell=1;
       int []dp=new int[m];
       Arrays.fill(dp,1);
       for(int i=1;i<m;i++){
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i],dp[j]+1);
            }

        }
        maxwell=Math.max(maxwell,dp[i]); 
       }  
       return maxwell;
    }
}
            
       
    