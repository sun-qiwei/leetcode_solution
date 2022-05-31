/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        if(root==null){
            return list;
        }
        storeNode(root,map);
        TreeNode last = target;
        while(k>=0){
           
            getChildNode(target,last,k,list);
            k=k-1;
            last = target;
            if(target!=null){
                 target=map.get(target);
            }
            
           
        }
        return list;
       
    }
    public  void getChildNode(TreeNode root,TreeNode last,int k,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if (k==0){
            list.add(root.val);
           return;
        }
        
        else{
              k=k-1;
                if(root.left!=last){
                     getChildNode(root.left,root,k,list);   
                }
                if(root.right!=last){
                         getChildNode(root.right,root,k,list);   
                    }
               
              
        }
       return;
        
       
        
    }
    public void storeNode(TreeNode root,HashMap<TreeNode,TreeNode> map){
        if(root == null){
            return;
        }
        if(root.left!=null){
             map.put(root.left,root);
        }
        if(root.right!=null){
             map.put(root.right,root);
        }
    
        storeNode(root.right,map);
        storeNode(root.left,map);    
    }
    
}
