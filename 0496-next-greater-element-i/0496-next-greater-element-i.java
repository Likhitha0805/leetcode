import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap<>();
        Stack<Integer>s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
            while(!s.isEmpty()&&s.peek()<=num){
                s.pop();
            }
            int nextGreater = s.isEmpty() ? -1 : s.peek();
            m.put(num, nextGreater);
            s.push(num);

        }
        int[]a=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){

            a[i]= m.get(nums1[i]);
        }
        return a;
        
    }
}