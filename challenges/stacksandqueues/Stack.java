package stacksandqueues;

import java.util.EmptyStackException;

class Stack {
       public Node top;

       public Stack(){

       }
    public void push(int value){
               Node newNode = new Node(value,null);// first i create a node
               newNode.next = top;  // make the node point to top that is pointing to.
               top = newNode; // top now is pointing to the last element added to stack
       }

    public int pop(){
           try {
               Node temp = top; // create temporary value to hold removed element
               top = top.next; // make top point to the next element
               temp.next = null;  // then make the removed node refer to null, and leave it to garbage collector to clean memory
               return temp.value; // return the value of removed item

           }catch (EmptyStackException n){
               return -1;
           }
      }

    public int peek(){
          if(this.isEmpty()){
              return  -1;
          }else{
              return top.value;
          }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args){
              Stack stack = new Stack();

              System.out.println(stack.peek());
//              System.out.println(stack.pop());
       }
}