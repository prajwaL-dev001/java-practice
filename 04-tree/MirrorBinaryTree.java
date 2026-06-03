class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class MirrorBinaryTree {

    static void mirror(Node root) {

        if (root == null) {
            return;
        }

        // Swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively mirror subtrees
        mirror(root.left);
        mirror(root.right);
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Before Mirror:");
        inorder(root);

        mirror(root);

        System.out.println("\nAfter Mirror:");
        inorder(root);
    }
}