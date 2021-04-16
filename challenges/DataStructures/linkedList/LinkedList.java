package DataStructures.linkedList;

public class LinkedList {
      Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

//     Can properly insert into the linked list
        System.out.println("Can properly insert one or multiple value into the linked list");
        list.insert(2);
        list.insert(8);

        list.insert(3);
        list.insert(7);
        list.insertAfter(3,10);
        System.out.println(list.toString());


    }

//..................................  constructor ...............................
   public LinkedList(){
    }
    public LinkedList (Node node){
       this.head = node;
   }

// ............................
public static LinkedList zipLists(LinkedList one, LinkedList two){
         LinkedList bigLinkedList = new LinkedList();
            Node currentOne = one.head;
            Node currentTwo = two.head;

            while( currentOne !=null || currentTwo !=null){
                if(currentOne == null){
                    bigLinkedList.append(currentTwo.value);
                    currentTwo = currentTwo.next;
                }else if(currentTwo  == null){
                    bigLinkedList.append(currentOne.value);
                    currentOne =currentOne.next;
                }else{
                    bigLinkedList.append(currentOne.value);
                    bigLinkedList.append(currentTwo.value);
                    currentOne =currentOne.next;
                    currentTwo = currentTwo.next;
                }
            }

         return bigLinkedList;
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
//         current = head;
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