package linkedList;

public class LinkedList {
      Node head ;

    public static void main(String[] args) {
// Can successfully instantiate an empty linked list
        LinkedList list = new LinkedList();

//        Can properly insert into the linked list
        Node node = new Node();  // one
        node.value = 5;
        list.insert(node);
// Can properly insert multiple nodes into the linked list
        Node nodeTwo = new Node(); // two
        nodeTwo.value=10;
        list.insert(nodeTwo);

        Node nodeThree = new Node(); // three
        nodeThree.value=15;
        list.insert(nodeThree);
        Node nodeFour = new Node(); // four
        nodeFour.value=20;
        list.insert(nodeFour);

//        Will return true when finding a value within the linked list that exists
//        Will return false when searching for a value in the linked list that does not exist

        System.out.println("Check if list does include 10 item :" + list.includes( 10));
        System.out.println("Check if list does not include 50 item :" + list.includes( 50));

//        Can properly return a collection of all the values that exist in the linked list
        String toStringResult = list.toString();
        System.out.println(toStringResult);

    };
//......................................  constructor ...............................
    LinkedList(){
        System.out.println("Success iniate empty linked list");
    }
   LinkedList (Node node){
       this.head = node;
   }


//............................................ insert .................................
  public void insert(Node node){

      try{
          if( head != null){
            node.next = head.next;
            this.head.next = node;
            System.out.println("Can properly insert into the linked list: "+ node.value);
         }else{
            this.head = node;
              System.out.println("Can properly insert into the linked list, Inserted head: "+this.head.value);
        }
      }catch(Exception ex){
          HandleError.customErrorHandler();  // From class HndlerError
      }
  }

//  .................................... includes ..................................
  public boolean includes ( int value ){
       Node current = head;

       while(current !=null){
          if(value == current.value){
              return true;
          }
              current = current.next;
       }
      return false;
   }
//   ............................. To String  .............................
    public String toString() {
      Node current = head;
      String string = "";

      while(current != null){
          string +=  "{" + current.value +"} -> ";
          current = current.next;
      }

        return string + "" + current;
    }
}