package hashtable;

public class Hashtable<T> {
    Entry[] hashTable;
    int size;

    public Hashtable( int size) {
        this.size = size;
        hashTable = new Entry[this.size];
           for(int i=0; i<hashTable.length; i++)
             hashTable[i] = new Entry<T>();
     }

    // takes in an key and returns an index in the collection
    int hash(int key){
        return key%size;
    }

    /*
       * takes in both the key and value.
       * This method should hash the key.
       * and add the key and value pair to the table.
       * handling collisions as needed.
    */
    public void add(Integer key, T value){
        int index = hash(key);
        Entry arrayEntry = hashTable[index];

         if( arrayEntry == null){
             arrayEntry.key = key;
             arrayEntry.value = value;
             arrayEntry.next = null;
         }else{
             Entry newEntry = new Entry<T>(key, value);
             newEntry.next = arrayEntry.next;
             arrayEntry.next = newEntry;
         }
    }

    // takes in the key.
    // returns the value from the table.
    public T get(Integer key){
        int index = hash(key);

        T value = null;

        Entry arrayItem = hashTable[index];

        while(arrayItem !=null){
            if(arrayItem.key == key){
                value = (T)arrayItem.value;
                break;
            }
            arrayItem = arrayItem.next;
        }
     return value;
    }

    /*
        * takes in the key
        * indicating if the key exists in the table already.
        * returns a boolean
     */
    public boolean contains(Integer key){
        int index = hash(key);
//        System.out.println("contains: " + index);


        Entry item = hashTable[index];

        while(item != null){
            if( key == item.key) return true;

            item = item.next;
        }
     return  false;
    }
}