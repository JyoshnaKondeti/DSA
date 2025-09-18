class Solution {
    Integer prev = null;
    int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(prev!=null){
            minDiff = Math.min(minDiff, Math.abs(root.val-prev));
        }
        prev=root.val;
        inOrder(root.right);
    }
}