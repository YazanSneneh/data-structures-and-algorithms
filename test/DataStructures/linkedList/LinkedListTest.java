package DataStructures.linkedList;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import stacksandqueues.Node;
import stacksandqueues.Queue;

public class LinkedListTest {
    LinkedList list = new LinkedList();

//    ........................... Class 10 tests Stack and Queue .....................
    @Test
    public void stackTests(){
        Stack stack = new Stack();

        assertTrue("Test Can successfully instantiate an empty stack : " ,  stack.isEmpty());

        stack.push(0);
        assertEquals("Can successfully push onto a stack: " , 0, stack.peek());
        stack.push(5);
        assertEquals("Can successfully push multiple values onto a stack: " , 5, stack.peek());
        assertEquals("Can successfully pop off the stack ", 5,stack.pop());
        assertEquals("Can successfully peek the next item on the stack : " , 0, stack.peek());
        assertEquals("Can successfully pop off the stack ", 0,stack.pop());
        assertEquals("Can successfully empty a stack after multiple pops ", true,stack.isEmpty());
    }

    @Test
    public void queueTests(){

        Node first = new Node(0,null);
        Queue testQueue = new Queue(first);
        Queue queue = new Queue();
        assertFalse("is empty expected false",testQueue.isEmpty());
        assertEquals("Can successfully enqueue into a queue", 5,testQueue.enqueue(5));
        assertEquals("Can successfully enqueue multiple values into a queue", 15,testQueue.enqueue(15));
        assertFalse("is empty expected false",testQueue.isEmpty());

        assertEquals("Can successfully peek into a queue, seeing the expected value", 0, testQueue.peek());

        assertEquals("Can successfully dequeue out of a queue the expected value", 0, testQueue.dequeue());
        assertEquals("Can successfully empty a queue after multiple dequeues", 5, testQueue.dequeue());
        assertEquals("Can successfully empty a queue after multiple dequeues", 15, testQueue.dequeue());

        assertEquals("Calling dequeue or peek on empty queue raises exception", -1, testQueue.dequeue());
        assertEquals("Calling dequeue or peek on empty queue raises exception", -1,testQueue.peek());

        assertTrue("is empty expected true",testQueue.isEmpty());

    }
    //    ..................... Code Challenge: Class 08 testZipTwoArrays .....................
    @Test    // Challenge 08 test
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
//....................................... Code Challenge: Class 07 ..............................
  @Test
  public void kthFromEndTest(){
        LinkedList knthList = new LinkedList();
      list.insert(2);
      assertEquals("Where the linked list is of a size 1", 2, list.kthFromEnd(0));
      list.insert(8);
      list.insert(3);
      list.insert(7);

      assertEquals("Where k is greater than the length of the linked list", -1, list.kthFromEnd(10));
      assertEquals("Where k and the length of the list are the same", 7, list.kthFromEnd(3));
      assertEquals("Where k is not a positive integer", -1, list.kthFromEnd(-10));
      assertEquals("“Happy Path” where k is not at the end, but somewhere in the middle of the linked list", 3, list.kthFromEnd(2));

  }

//....................................... Code Challenge: Class 06 ..............................
@Test
    public void appendInsertBeforeAfterTest(){
        LinkedList linkedListClass6 = new LinkedList();
    linkedListClass6.append(100);

    assertEquals("Can successfully add a node to the end of the linked list", "{100} -> null", linkedListClass6.toString() );
    linkedListClass6.append(23);
    linkedListClass6.append(2);
    assertEquals("Can successfully add multiple nodes to the end of a linked list", "{100} -> {23} -> {2} -> null", linkedListClass6.toString() );
    linkedListClass6.insertBefore(23,5);
    assertEquals("Can successfully insert a node before a node located i the middle of a linked list", "{100} -> {5} -> {23} -> {2} -> null", linkedListClass6.toString());

    linkedListClass6.insertBefore(100,15);
    assertEquals("Can successfully insert a node before the first node of a linked list", "{15} -> {100} -> {5} -> {23} -> {2} -> null", linkedListClass6.toString());

    linkedListClass6.insertAfter(100,88);
    assertEquals("Can successfully insert after a node in the middle of the linked list", "{15} -> {100} -> {88} -> {5} -> {23} -> {2} -> null", linkedListClass6.toString() );

    linkedListClass6.insertAfter(2,99);
    assertEquals("Can successfully insert a node after the last node of the linked list", "{15} -> {100} -> {88} -> {5} -> {23} -> {2} -> {99} -> null", linkedListClass6.toString() );

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