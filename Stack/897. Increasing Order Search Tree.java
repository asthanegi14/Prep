/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(Stack<TreeNode> st, TreeNode root){
        if(root==null){
            return;
        }
        if(root.left != null){
            inorder(st, root.left);
        }
        st.push(root);
        if(root.right != null){
            inorder(st, root.right);
        }
    }
    // ArrayList<Integer> ans = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        // if(root==null){
        //     return root;
        // }
        // if(root.left!=null){
        //     increasingBST(root.left);
        // }
        // ans.add(root.val);
        // if(root.right!=null){
        //     increasingBST(root.right);
        // }

        // TreeNode node = new TreeNode(-1);
        // TreeNode temp = node;
        // for(int i=0;i<ans.size();i++){
        //     temp.right = new TreeNode(ans.get(i));
        //     temp = temp.right;
        // }
        // return node.right;
        Stack<TreeNode>st = new Stack<>();
        inorder(st, root);

        TreeNode node = st.pop();
        TreeNode temp = node;
        temp.left = null;

        while(!st.isEmpty()){
            node = st.pop();
            node.left = null;
            node.right = temp;
            temp = node;
        }

        return node;
    }
}
