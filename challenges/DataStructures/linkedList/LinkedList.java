package DataStructures.linkedList;

public class LinkedList {
      Node head;

    public static void main(String[] args) {
// Can successfully instantiate an empty linked list
        LinkedList list = new LinkedList();

//     Can properly insert into the linked list
//        System.out.println("Can properly insert one or multiple value into the linked list");
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(7);
//        System.out.println(list);
//        System.out.println("Check if list does include 10 item :" + list.includes( 200));
//        System.out.println("Check if list does not include 50 item, expected false :" + list.includes( 50));


//        System.out.println( ".................................................................");
//        System.out.println( "...................linked list challenge 2 ......................");
//        System.out.println( ".................................................................");
//

//       System.out.println("can properly append new node when list is empty");
//       list.append(2);
//       System.out.println(list);

//       System.out.println("can properly append new node when list is not empty");
//       list.append(40);
//       System.out.println(list);


//       System.out.println(" happy(success) and failure(should not or null pointer exception) test Append first value 100 after 10 : ");
//       System.out.println(list);

//       System.out.println("Append second value 555 after 100 : ");
//       System.out.println(list.toString());
//       list.insertBefore(300, 999);
//       System.out.println( "Insert 999 before 300, expected result = {999} -> {300} ->");
//       System.out.println(list.toString());

//       System.out.println("Insert 255 after 100, expected result = {100} -> {255} ->");
//       list.insertAfter(100, 255);

        System.out.println( ".................................................................");
        System.out.println( "...................linked list challenge 3 ......................");
        System.out.println( ".................................................................");
        System.out.println(list.toString());
        System.out.println( "take input (12 > list size) and should return -1 : "+ list.kthFromEnd(12));
        System.out.println( "Where k and the length of the list are the same, "+list.kthFromEnd(3));
        System.out.println( "Where k is not a positive integer "+list.kthFromEnd(-3));
        System.out.println( "Where the linked list is of a size 1, should return 2,  "+list.kthFromEnd(0));

        System.out.println( "happy path k in the middle and is 2, found and should return 3 value : "+list.kthFromEnd(12));
}

//..................................  constructor ...............................
   public LinkedList(){
       System.out.println("Initiated empty array list successfully");
    }
    public LinkedList (Node node){
       this.head = node;
   }
//...................................... insert .................................
  public void insert(int val){
           this.head = new Node(val,this.head);
  }
//  .................................... includes ..................................
  public boolean includes ( int value){
      Node current = head;
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
         Node node = new Node(value,null );
         Node current = head;

         if(current == null){
             head = node;
         }else{
             while(current !=null){
                 if(current.next ==null){
                     current.next = node;
                     break;
                 }
                 current = current.next;
             }
         }

     }
// ........................... insertBefore .............................
    public void insertAfter(int value, int newVal){
        // get the value and store it inside a node;
           Node newNode = new Node();
           newNode.value = newVal;
           Node current = head;

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
        Node current = head;
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
// ............................... ll.kthFromEnd(k) .......................
    public int kthFromEnd(int k){
        Node current = head;
        int counter = 0;
        int result = 0;

        if(head == null){
            return -1;
        }else{

            while (current.next != null){
                counter +=1;
                current = current.next;
            }

            if(k > counter ||k < 0 ){
                return -1;
            }else{
                current = head;
                while(counter >=0){
                    if( k == counter){
                        result = current.value;
                    }
                    current = current.next;
                    counter --;
                }
            }
            }
        return result;
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