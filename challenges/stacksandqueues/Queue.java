package stacksandqueues;

public class Queue {
     public Node front;
     public Node rear;

    public Queue(Node front) {
        this.front = front;
        this.rear = front;
    }
    public Queue() {
        this.front = front;
        this.rear = front;
    }

     public int enqueue(int val){
         Node newNode = new Node(val, null);
         rear.next = newNode;
         rear = newNode;
         return rear.value;
     }

     public int dequeue() {
         try {
             Node temp = front;// create a temporary node to hold the current front.
              // make it point to the same node front pointing to.
             front = front.next;   // then make the front point to the next node
             temp.next = null; // now we don't have unnecessary references, so garbage collector clean it
             return temp.value; // return value of removed node
         } catch (NullPointerException n) {
             return -1;
         }
     }

     public int peek() {
        try {
            return front.value;
        }catch (NullPointerException n){
            System.out.println(n);
            return -1;
        }
     }
     public boolean isEmpty(){
        return front == null;
     }

    public static void main(String[] args){
        Node first = new Node(15,null);
        Queue queue = new Queue(first);
          queue.enqueue(500);
          queue.enqueue(20);
        System.out.println(queue.dequeue());


    }
}