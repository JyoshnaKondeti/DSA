class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null &root.right == null) return root.val== targetSum;
        int remainingsum = targetSum-root.val;
        return hasPathSum(root.left,remainingsum) || hasPathSum(root.right, remainingsum);
    }
}