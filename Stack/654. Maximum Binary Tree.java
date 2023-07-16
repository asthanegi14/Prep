class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Stack<TreeNode> st = new Stack<>();

        for(int i:nums){
            TreeNode root = new TreeNode(i);
            while(!st.isEmpty() && st.peek().val<root.val){
                root.left = st.pop();
            }
            if(!st.isEmpty()){
                st.peek().right = root;
            }
            st.push(root);
        }

        while(st.size()!=1){
            st.pop();
        }
        return st.isEmpty()?null:st.pop();
    }
}
