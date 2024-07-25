package main.trees;

public class BinarySearchTree {
    public BinarySearchNode root;

    public void add(int value) {
        root = addRecursive(value, root);
    }

    private static BinarySearchNode addRecursive(int value, BinarySearchNode rootPointer) {
        if (rootPointer == null) return new BinarySearchNode(value);
        else if (value == rootPointer.value) return rootPointer;
        else if (value < rootPointer.value) rootPointer.left = addRecursive(value, rootPointer.left);
        else rootPointer.right = addRecursive(value, rootPointer.right);
        return rootPointer;
    }

    public boolean search(int value) {
        BinarySearchNode result = searchAndGetRecursive(value, root);
        return result != null && result.value == value;
    }

    private static BinarySearchNode searchAndGetRecursive(int value, BinarySearchNode rootPointer) {
        return (rootPointer == null || rootPointer.value == value) ? rootPointer : (value > rootPointer.value) ? searchAndGetRecursive(value, rootPointer.right) : searchAndGetRecursive(value, rootPointer.left);
    }

    public boolean delete(int value) {
        if (!search(value)) return false;
        deleteRecursive(value, root);
        return true;
    }

    private static BinarySearchNode deleteRecursive(int value, BinarySearchNode rootPointer) {
        if (rootPointer == null) return null;
        if (value == rootPointer.value) {
            if (rootPointer.right == null)
                return rootPointer.left;
            else if (rootPointer.left == null)
                return rootPointer.right;
            else {
                BinarySearchNode lowestNode = rootPointer.right;
                while (lowestNode.left != null) lowestNode = lowestNode.left;
                lowestNode.left = rootPointer.left;
                return rootPointer.right;
            }
        } else if (value > rootPointer.value)
            rootPointer.right = deleteRecursive(value, rootPointer.right);
        else rootPointer.left = deleteRecursive(value, rootPointer.left);
        return rootPointer;
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private static void prettyDisplay(BinarySearchNode node, int level) {
        if (node == null) return;
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t\t");
            System.out.println("|------->" + node.value);
        } else System.out.println(node.value);
        prettyDisplay(node.left, level + 1);
    }
}
