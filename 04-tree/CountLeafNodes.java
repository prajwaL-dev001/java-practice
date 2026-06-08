class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

public class CountLeafNodes {

    static int countLeafNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // If node has no children
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeafNodes(root.left)
                + countLeafNodes(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        System.out.println(
            "Leaf Nodes Count: "
            + countLeafNodes(root)
        );
    }
}