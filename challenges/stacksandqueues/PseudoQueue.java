package stacksandqueues;

public class PseudoQueue{
      Node front;
      Node rear;

    Stack queueStack;
    Stack stack;
 public int enqueue(int val){
          Node node = new Node(val,null);
          if(this.front == null){
              rear = node;
              front = node;
          }else{
//              node.next = rear;
//              rear = node;
              while (this.isEmpty()){
                  queueStack.push(this.dequeue());

                  front = front.next;
              }
              front = node;

              while (queueStack.isEmpty()){
                  stack.push(queueStack.pop());
                  this.enqueue(stack.pop());
              }
          }
          return val;
      }

public boolean isEmpty(){
     return front == null;
}

public int dequeue(){
           try {
               Node temp = new Node();
               temp = front;
               front = front.next;
               temp.next = null;
               return temp.value;
           }catch (NullPointerException n){
              return -1;
           }
      }

    public String toString() {
         Node print;
          String result = "";
         print = front;
        while(print != null){
            result+="{ "+print.value + " }  -> ";
            print = print.next;
        }
        return "PseudoQueue " + result + " " + print;
    }

    public static void main(String[] args){
        PseudoQueue  pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(15);
        System.out.println(pseudoQueue.toString());
    }
}