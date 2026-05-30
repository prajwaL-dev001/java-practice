class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class FindMaxInBinaryTree {

    static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println("Max Value: " + findMax(root));
    }
}