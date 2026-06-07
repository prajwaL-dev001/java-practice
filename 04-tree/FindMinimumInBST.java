class BSTNode {

    int data;
    BSTNode left, right;

    BSTNode(int val) {
        data = val;
        left = right = null;
    }
}

public class FindMinimumInBST {

    static int findMin(BSTNode root) {

        if (root == null) {
            return -1;
        }

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    public static void main(String[] args) {

        BSTNode root = new BSTNode(50);

        root.left = new BSTNode(30);
        root.right = new BSTNode(70);

        root.left.left = new BSTNode(20);
        root.left.right = new BSTNode(40);

        root.right.left = new BSTNode(60);
        root.right.right = new BSTNode(80);

        System.out.println("Minimum Value: " + findMin(root));
    }
}