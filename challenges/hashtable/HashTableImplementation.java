package hashtable;

public class HashTableImplementation {

    public static void main(String[] args){
        Hashtable<String> hash = new Hashtable<String>(15);
        hash.add(22,"Yazan");
        hash.add(11,"Ahmad");
        hash.add(22,"Ahmad");
        hash.add(1,"Omar");

        System.out.println(hash.contains(55));
        System.out.println(hash.get(1));
    }

}
