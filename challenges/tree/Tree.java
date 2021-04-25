package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    tree.Node root;

    Tree(int key) {
        root = new Node(key);
    }

    Tree() {
        root = new Node();
    }

    public static void main(String[] args){
        Tree tree = new Tree(10);
//
//        //        .................................... binarySearchTree ...........................
        BinarySearchTree bSTree = new BinarySearchTree();

        bSTree.add( 5, tree.root);
        bSTree.add( 25, tree.root);
        bSTree.add( 4, tree.root);
        bSTree.add( 15, tree.root);
        bSTree.add( 20, tree.root);
        bSTree.add( 30, tree.root);

//
//
//        // now do a binary tree object to implement preOrder, inOrder, Post order
        BinaryTree  bTree = new BinaryTree();
         bTree.preOrder(tree.root);
          String values ="";
         // output the result
        for(int i=0; i<bTree.nodes.size(); i++){
           values += bTree.nodes.get(i)+ " ";
        }

        System.out.println(bTree.findMaximumValue(tree.root));


    }

}
