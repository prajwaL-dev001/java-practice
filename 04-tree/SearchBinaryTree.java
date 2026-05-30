class SearchBinaryTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean search(TreeNode root, int target) {

        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        return search(root.left, target) || search(root.right, target);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(20);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);

        System.out.println(search(root, 8));
    }
}