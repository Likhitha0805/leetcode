class Solution {
    public int majorityElement(int[] nums) {
        int c=0,cand=0;
        for(int n:nums){
            if(c==0){
                cand=n;
                c=1;
            }
            else if(n==cand){
                c++;
            }
            else{
                c--;
            }
        }
        int freq=0;
        for(int num:nums){
            if(num==cand){
                freq++;
            }
        }
        if(freq>(nums.length)/2){
            return cand;
        }
        else{
            return -1;
        }
        
    }
}