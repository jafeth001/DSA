package binaryTreeAlgo;

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insertHelper(root, data);
    }

    public Node insertHelper(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertHelper(root.left, data);
        } else if (data > root.data) {
            root.right = insertHelper(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderHelper(root);
    }

    public void inOrderHelper(Node root) {
        if (root != null) {
            inOrderHelper(root.left);
            System.out.print(root.data + " ");
            inOrderHelper(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inOrder();
    }
}
