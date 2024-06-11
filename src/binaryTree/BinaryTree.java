package binaryTree;

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insetHelper(root, data);
    }

    private Node insetHelper(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insetHelper(root.left, data);
        } else if (data > root.data) {
            root.right = insetHelper(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderHelper(root);
    }

    public void inorderHelper(Node root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.println(root.data);
            inorderHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    public boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);

        } else {
            System.out.println(data + " not found");
        }
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = sucesssor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    public int sucesssor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(12);
        tree.insert(1);
        tree.remove(1);
        tree.inorder();
        System.out.println(tree.search(2));
    }
}
