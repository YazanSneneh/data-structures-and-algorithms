package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeInterSectionTest {
    TreeInterSection treeInterSection = new TreeInterSection();
    BinarySearchTree bSTree = new BinarySearchTree();

    @Test
    public void findCommonEdgeCaseTest() {
        Tree treeOne = new Tree();
        Tree treeTwo = new Tree();

        List expected = new ArrayList();

        List actual = treeInterSection.findCommon(treeOne, treeTwo);
        assertEquals("", expected, actual);

    }

    @Test
    public void findCommonHappyCaseTest() {
        Tree treeOne = new Tree(10);
        bSTree.add( 5, treeOne.root);
        bSTree.add( 25, treeOne.root);
        bSTree.add( 4, treeOne.root);
        bSTree.add( 15, treeOne.root);
        bSTree.add( 20, treeOne.root);
        bSTree.add( 30, treeOne.root);

        Tree treeTwo = new Tree(10);
        bSTree.add( 5, treeTwo.root);
        bSTree.add( 15, treeTwo.root);
        bSTree.add( 25, treeTwo.root);
        bSTree.add( 35, treeTwo.root);
        bSTree.add( 45, treeTwo.root);


        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(5);
        expected.add(25);
        expected.add(15);

        List actual = treeInterSection.findCommon(treeOne, treeTwo);
        assertEquals("", expected, actual);

    }


    @Test
    public void findCommonOneTreeEmptyTest() {
        Tree treeOne = new Tree(10);
        bSTree.add( 5, treeOne.root);
        bSTree.add( 25, treeOne.root);
        bSTree.add( 4, treeOne.root);
        bSTree.add( 15, treeOne.root);
        bSTree.add( 20, treeOne.root);
        bSTree.add( 30, treeOne.root);

        Tree treeTwo = new Tree();

        List expected = new ArrayList();

        List actual = treeInterSection.findCommon(treeOne, treeTwo);
        assertEquals("", expected, actual);
    }


    @Test  // if it fail it should return result, if it success it should be empty
    public void findCommonExpectedFailureTest() {
        Tree treeOne = new Tree(100);
        bSTree.add( 115, treeOne.root);
        bSTree.add( 125, treeOne.root);
        bSTree.add( 14, treeOne.root);
        bSTree.add( 115, treeOne.root);
        bSTree.add( 210, treeOne.root);
        bSTree.add( 301, treeOne.root);

        Tree treeTwo = new Tree(10);
        bSTree.add( 5, treeTwo.root);
        bSTree.add( 15, treeTwo.root);
        bSTree.add( 25, treeTwo.root);
        bSTree.add( 35, treeTwo.root);
        bSTree.add( 45, treeTwo.root);

        List<Integer> expected = new ArrayList<>();

        List actual = treeInterSection.findCommon(treeOne, treeTwo);
        assertEquals("", expected, actual);
    }


}