package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    Tree(int key) {
        root = new Node(key);
    }

    Tree() {
        root = null;
    }

    public static void main(String[] args){
        Tree treeOne = new Tree(10);
        Tree treeTwo = new Tree(100);
//
//        //        .................................... binarySearchTree ...........................
        BinarySearchTree bSTree = new BinarySearchTree();

        bSTree.add( 5, treeOne.root);
        bSTree.add( 25, treeOne.root);
        bSTree.add( 4, treeOne.root);
        bSTree.add( 15, treeOne.root);
        bSTree.add( 20, treeOne.root);
        bSTree.add( 30, treeOne.root);

//        System.out.println(bSTree.contains(10, treeOne.root));


        // now do a binary tree object to implement preOrder, inOrder, Post order
        BinaryTree  bTree = new BinaryTree();
         bTree.preOrder(treeOne.root);
          String values ="";
         // output the result
        for(int i=0; i<bTree.nodes.size(); i++){
//           values += bTree.nodes.get(i)+ " ";

            System.out.println( bTree.nodes.get(i));

        }

//        System.out.println(bTree.findMaximumValue(treeOne.root));

    }

}
