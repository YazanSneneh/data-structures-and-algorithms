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
        BinarySearchTree bSTree = new BinarySearchTree();

        bSTree.add( 5, tree.root);
        bSTree.add( 25, tree.root);
        bSTree.add( 4, tree.root);
        bSTree.add( 15, tree.root);
        bSTree.add( 20, tree.root);
        bSTree.add( 30, tree.root);

        BinaryTree  bTree = new BinaryTree();

        String values ="";
       List nodes =  bTree.breadthFirstTraversal(tree.root);
        for(int i=0; i< nodes.size(); i++){
           values += bTree.nodes.get(i)+ " ";

        }
        System.out.println(values);
    }


}
