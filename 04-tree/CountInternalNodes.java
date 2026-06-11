class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

public class CountInternalNodes {

    static int countInternalNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 0;
        }

        return 1 + countInternalNodes(root.left)
                 + countInternalNodes(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        System.out.println(
            "Internal Nodes Count: "
            + countInternalNodes(root)
        );
    }
}