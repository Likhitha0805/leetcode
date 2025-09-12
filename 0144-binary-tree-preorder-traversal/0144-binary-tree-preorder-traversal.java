import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        data=val;
        left=null;
        right=null;
    }
}
class Solution{ 
    static List<Integer> preorderTraversal(TreeNode root) {
       
        List<Integer> arr = new ArrayList<>();
        
        preorder(root, arr);
        
        return arr;
    }


    static void preorder(TreeNode root,List<Integer>arr){
     if(root==null){
        return;
     }
     arr.add(root.data);
     preorder(root.left,arr);
     preorder(root.right,arr);
    }
    
}
