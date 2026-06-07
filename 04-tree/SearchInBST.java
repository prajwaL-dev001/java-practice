class BSTNode {

    int data;
    BSTNode left, right;

    BSTNode(int val) {
        data = val;
        left = right = null;
    }
}

public class SearchInBST {

    static boolean search(BSTNode root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

        BSTNode root = new BSTNode(50);

        root.left = new BSTNode(30);
        root.right = new BSTNode(70);

        root.left.left = new BSTNode(20);
        root.left.right = new BSTNode(40);

        root.right.left = new BSTNode(60);
        root.right.right = new BSTNode(80);

        int key = 60;

        if (search(root, key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}