package test.trees;

import junit.framework.TestCase;
import main.trees.BinarySearchTree;

public class BinarySearchTreeTest extends TestCase {
    BinarySearchTree tree;

    protected void setUp() {
        tree = new BinarySearchTree();
        tree.add(5);
        tree.add(4);
        tree.add(4);
        tree.add(6);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(8);
    }

    public void testInsertionWithoutSearch() {
        assertEquals(5, tree.root.value);
        assertEquals(4, tree.root.left.value);
        assertEquals(4, tree.root.left.value);
        assertEquals(6, tree.root.right.value);
        assertEquals(3, tree.root.left.left.value);
        assertEquals(7, tree.root.right.right.value);
        assertEquals(2, tree.root.left.left.left.value);
        assertEquals(8, tree.root.right.right.right.value);
    }

    public void testSearchSuccess() {
        assertTrue(tree.search(8));
    }

    public void testSearchFailure() {
        assertFalse(tree.search(5000000));
    }

    public void testDeleteSuccess() {
        assertTrue(tree.delete(8));
        assertFalse(tree.search(8));
    }

    public void testDeleteFailure() {
        assertFalse(tree.delete(8000000));
    }
}
