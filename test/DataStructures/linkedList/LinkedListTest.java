package DataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list = new LinkedList();

    @Test
    public void testZipTwoArrays(){
        LinkedList newList = new LinkedList();
        LinkedList one = new LinkedList();
        one.append(1);
        one.append(2);
        one.append(3);
        one.append(4);
        one.append(5);

        LinkedList two = new LinkedList();
        two.append(10);
        two.append(11);
        two.append(12);
        two.append(13);

        newList = LinkedList.zipLists(one, two);
        assertEquals("Happy case different size : zipLists(one, two) should zip two lists together ", "{1} -> {10} -> {2} -> {11} -> {3} -> {12} -> {4} -> {13} -> {5} -> null",  newList.toString());
        assertEquals("failure case : zipLists(one, two) should fail if they are not the same size  ", "Error null values",  newList.toString());
    }

    @Test
    public void main() {
         list.append(5);
         list.append(15);
        assertEquals("append(5) First element should be 5 ",5, list.head.value);
        assertEquals("append(15) second element should be 15 added next to 5",15, list.head.next.value);
    }

    @Test
    public void testInsert() {
        list.insert(10);
        assertEquals("insert method(10) First element should be 10 ",10, list.head.value);
    }

    @Test
    public void testIncludes() {
        list.insert(10);
        list.insert(20);
        list.insert(30);

        assertEquals("includes should return true on 30 found", true, list.includes(30));
        assertEquals("includes should return false on 300 found", false, list.includes(300));
    }

}