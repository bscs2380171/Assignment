class BST {

    // ===== Node Class =====
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // ===== Insert Node =====
    public Node insert(Node root, int key) {
        if (root == null) return new Node(key);  // base case
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    // ===== Inorder Traversal =====
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // ===== Preorder Traversal =====
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // ===== Postorder Traversal =====
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // ===== Search Node =====
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // ===== Delete Node =====
    public Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) root.left = delete(root.left, key);
        else if (key > root.data) root.right = delete(root.right, key);
        else { // node found
            // Case 1: No child
            if (root.left == null && root.right == null) return null;
            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Case 3: Two children
            root.data = findMinValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // ===== Find Minimum =====
    public int findMinValue(Node root) {
        Node current = root;
        while (current.left != null) current = current.left;
        return current.data;
    }

    // ===== Find Maximum =====
    public int findMaxValue(Node root) {
        Node current = root;
        while (current.right != null) current = current.right;
        return current.data;
    }

    // ===== Count Total Nodes =====
    public int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // ===== Count Leaf Nodes =====
    public int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // ===== Height of Tree =====
    public int height(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
