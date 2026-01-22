public class MainBST {
    public static void main(String[] args) {

        BST tree = new BST();

        // Insert elements: 50, 30, 70, 20, 40, 60, 80
        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int el : elements) {
            tree.root = tree.insert(tree.root, el);
        }

        // 1. Traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        // 2. Search element 60
        boolean found = tree.search(tree.root, 60);
        System.out.println("Search 60: " + (found ? "Found" : "Not Found"));

        // 3. Delete node 80
        tree.root = tree.delete(tree.root, 80);
        System.out.print("Inorder after deleting 80: ");
        tree.inorder(tree.root);
        System.out.println();

        // 4. Minimum and Maximum
        System.out.println("Minimum value: " + tree.findMinValue(tree.root));
        System.out.println("Maximum value: " + tree.findMaxValue(tree.root));

        // 5. Count nodes
        System.out.println("Total nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf nodes: " + tree.countLeafNodes(tree.root));

        // 6. Height of tree
        System.out.println("Height of tree: " + tree.height(tree.root));
    }
}
