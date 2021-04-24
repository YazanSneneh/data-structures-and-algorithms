package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    Tree tree = new Tree(10);
    BinarySearchTree bSTree = new BinarySearchTree();
    BinaryTree bTree = new BinaryTree();


    @Test
    public void initEmptyTreeTest() {
        Tree tree = new Tree();
        assertNotNull("Can successfully instantiate an empty tree",tree);
    }

    @Test
    public void initNotEmptyTreeTest(){
        assertNotNull("Can successfully instantiate an empty tree",tree);
    }

    @Test //Can successfully add a left child and right child to a single root node
    public void addTest(){

         Integer leftVal = bSTree.add(5,tree.root).getValue();
         Integer rightVal = bSTree.add( 25, tree.root).getValue();

        assertEquals("Can successfully add a left child to a single root node",leftVal , tree.root.getLeft().getValue());
        assertEquals("Can successfully add a right child to a single root node",rightVal , tree.root.getRight().getValue());
    }

    @Test //Can successfully return a collection from a preorder traversal
    public void preOrderTest() {
        bSTree.add( 5, tree.root);
        bSTree.add( 25, tree.root);
        bSTree.add( 4, tree.root);
        bSTree.add( 15, tree.root);
        bSTree.add( 20, tree.root);
        bSTree.add( 30, tree.root);
         bTree.preOrder(tree.root);
         String values = "";

        for(int i=0; i<bTree.nodes.size(); i++){
            values += bTree.nodes.get(i)+ " ";
        }

        assertEquals("Can successfully return a collection from a preorder traversal", "10 5 4 25 15 20 30",values.trim());
    }

    @Test //Can successfully return a collection from an inorder traversal
    public void inOrderTest() {
        bSTree.add( 5, tree.root);
        bSTree.add( 25, tree.root);
        bSTree.add( 4, tree.root);
        bSTree.add( 15, tree.root);
        bSTree.add( 20, tree.root);
        bSTree.add( 30, tree.root);

        String values = "";
        bTree.inOrder(tree.root);
        for(int i=0; i<bTree.nodes.size(); i++){
            values += bTree.nodes.get(i)+ " ";
        }
        assertEquals("Can successfully return a collection from a inOrder traversal", "4 5 10 15 20 25 30",values.trim());

    }

    @Test //Can successfully return a collection from a postorder traversal
    public void postOrderTest() {
        bSTree.add( 5, tree.root);
        bSTree.add( 25, tree.root);
        bSTree.add( 4, tree.root);
        bSTree.add( 15, tree.root);
        bSTree.add( 20, tree.root);
        bSTree.add( 30, tree.root);

        String values = "";
        bTree.postOrder(tree.root);
        for(int i=0; i<bTree.nodes.size(); i++){
            values += bTree.nodes.get(i)+ " ";
        }
        assertEquals("Can successfully return a collection from a postOrder traversal", "4 5 20 15 30 25 10",values.trim());
    }
    @Test
    public void containsTest(){
        bSTree.add( 5, tree.root);

        assertTrue("return false when Item is not in tree", bSTree.contains(10,tree.root));
        assertTrue("Can successfully return true when find 5 in the middle of the tree", bSTree.contains(5,tree.root));

        assertFalse("Can successfully return false when value 50 not found ", bSTree.contains(50,tree.root));

    }
}