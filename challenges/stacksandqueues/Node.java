package stacksandqueues;

public class Node{
    public int value;
    public Node next;

    public Node (){
    }

    public Node(int val, Node n){
        this.value = val;
        this.next = n;
    }
}