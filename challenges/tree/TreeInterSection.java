package tree;

import DataStructures.linkedList.LinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TreeInterSection {
    public static void main(String[] args){

        BinarySearchTree bSTree = new BinarySearchTree();
//  .................................... tree one ...........................
        Tree treeOne = new Tree(10);
        bSTree.add( 5, treeOne.root);
        bSTree.add( 25, treeOne.root);
        bSTree.add( 4, treeOne.root);
        bSTree.add( 15, treeOne.root);
        bSTree.add( 20, treeOne.root);
        bSTree.add( 30, treeOne.root);

//  .................................... tree two ...........................
        Tree treeTwo = new Tree(10);
        bSTree.add( 5, treeTwo.root);
        bSTree.add( 15, treeTwo.root);
        bSTree.add( 25, treeTwo.root);
        bSTree.add( 35, treeTwo.root);
        bSTree.add( 45, treeTwo.root);


        TreeInterSection treeInterSection = new TreeInterSection();
                treeInterSection.findCommon(treeOne, treeTwo);

    }

    public List findCommon(Tree treeOne, Tree treeTwo){
        BinaryTree  bTree = new BinaryTree();
        List interSectionArrayOne = new ArrayList<Integer>();
        List interSectionArrayTwo = new ArrayList<Integer>();

        List result = new ArrayList<Integer>();

        bTree.preOrder(treeOne.root);
        for(int i=0; i<bTree.nodes.size(); i++){
            interSectionArrayOne.add(bTree.nodes.get(i));
        }
        bTree.nodes.clear();
        bTree.preOrder(treeTwo.root);
        for(int i=0; i<bTree.nodes.size(); i++){
            interSectionArrayTwo.add(bTree.nodes.get(i));
        }

        for(int i=0; i<interSectionArrayTwo.size();i++){
                if(interSectionArrayTwo.contains(interSectionArrayOne.get(i)))
                result.add(interSectionArrayOne.get(i));
            }
        return result;
    }
}
