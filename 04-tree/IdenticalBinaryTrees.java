class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class IdenticalBinaryTrees {

    static boolean isIdentical(Node t1, Node t2) {

        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }

        return (t1.data == t2.data)
                && isIdentical(t1.left, t2.left)
                && isIdentical(t1.right, t2.right);
    }

    public static void main(String[] args) {

        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.right = new Node(3);

        if (isIdentical(tree1, tree2)) {
            System.out.println("Trees are Identical");
        } else {
            System.out.println("Trees are Not Identical");
        }
    }
}