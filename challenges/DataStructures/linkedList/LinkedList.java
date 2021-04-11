package DataStructures.linkedList;

public class LinkedList {
      Node head;
      Node current;

    public static void main(String[] args) {
// Can successfully instantiate an empty linked list
        LinkedList list = new LinkedList();

//    Can properly insert into the linked list
        Node node = new Node();  // one
        node.value = 300;
        list.insert(node);
// Can properly insert multiple nodes into the linked list
        Node nodeTwo = new Node(); // two
        nodeTwo.value =10;
        list.insert(nodeTwo);

        System.out.println("Check if list does include 10 item :" + list.includes( 10));
        System.out.println("Check if list does not include 50 item :" + list.includes( 50));

        System.out.println(list.toString());
        System.out.println( ".................................................................");
        System.out.println( "...................linked list challenge 2 ......................");
        System.out.println( ".................................................................");

        Node five = new Node();
        five.value = 100;
        list.append(five.value);
        System.out.println(" happy(sucess) and failure(should not or null pointer exception) test Append first value 100 after 10 : ");
        System.out.println(list.toString());
        Node last = new Node();
        last.value = 555;
        list.append(last.value);
        System.out.println("Append second value 555 after 100 : ");
        System.out.println(list.toString());
        list.insertBefore(300, 999);
        System.out.println( "Insert 999 before 300, expected result = {999} -> {300} ->");
        System.out.println(list.toString());

        System.out.println("Insert 255 after 100, expected result = {100} -> {255} ->");
        list.insertAfter(100, 255);
        System.out.println(list.toString());
    }
//......................................  constructor ...............................
   public LinkedList(){
        System.out.println("Success initiate empty linked list");
    }
    public LinkedList (Node node){
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
          HandleError.customErrorHandler();  // From class HandlersError
      }
  }
//  .................................... includes ..................................
  public boolean includes ( int value){
        current = head;
       while(current !=null){
          if(value == current.value){
              return true;
          }
             current = current.next;
       }
      return false;
   }
   // ................................ Append ...............................
     public void append(int value){
         Node node = new Node();
         node.value = value;
         current = head;
        try{
            while(current !=null){
                if(current.next ==null){
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }catch (NullPointerException ex){
            System.out.println("Null pointer exception");
        }
     }
// ........................... insertBefore .............................
    public void insertAfter(int value, int newVal){
        // get the value and store it inside a node;
           Node newNode = new Node();
           newNode.value = newVal;
           current = head;

        try{
              while(current !=null){
                    if(value == current.value){
                        newNode.next = current.next;
                        current.next = newNode;
                    }
                 current = current.next;
              }
        }catch(Exception ex){
            HandleError.customErrorHandler();  // From class HandlersError
        }
    }

    public void insertBefore(int value, int newVal){
        current = head;
        Node newNode = new Node();
        newNode.value = newVal;

        try{
            if(head !=null && head.value == value){
                newNode.next = head;
                head = newNode;
            }else{
                while( current.next != null){
                    if( current.next.value  == value){
                        newNode.next = current.next;
                        current.next = newNode;
                        break;
                    }
                    current = current.next;
                }
            }

        }catch(NullPointerException nul){
            System.out.println("null pointer exception");
        }
    }
//   ............................. To String  .............................
    public String toString() {
        current = head;
      String string = "";

      while(current != null){
          string +=  "{" + current.value +"} -> ";
          current = current.next;
      }
        return string + "" + current;
    }
}