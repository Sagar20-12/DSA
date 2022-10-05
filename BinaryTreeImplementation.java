class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

class BinaryTreeTraversal {
    Node root;
    BinaryTreeTraversal() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + "->");
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.item + "->");
        inorder(node.right);
    }
    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(100);
        tree.root.left = new Node(200);
        tree.root.right = new Node(300);
        tree.root.left.left = new Node(400);
        tree.root.left.right = new Node(500);

        System.out.println("Inorder traversal Implementation");
        tree.inorder(tree.root);
        System.out.println("\nPreorder traversal Implementation");
        tree.preorder(tree.root);
        System.out.println("\nPostorder traversal Implementation");
        tree.postorder(tree.root);
    }
}