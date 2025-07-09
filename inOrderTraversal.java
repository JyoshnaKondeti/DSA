public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class inOrderTraversal.java {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> list) {
        if (node == null) return;   
        traverse(node.left, list);         
        list.add(node.val);                   
        traverse(node.right, list);           
    }
}