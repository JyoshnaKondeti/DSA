class minimumDepth {
    public int minDepth(TreeNode root) {
        return height(root);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left == null) return height(root.right) +1;
        if(root.right == null) return height(root.left) +1;
        return Math.min(height(root.left), height(root.right)) +1;
    }
}