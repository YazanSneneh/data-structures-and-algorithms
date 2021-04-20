package utilities;

public class Node {
    Animal animal;
    Node next;

    public Node(Animal animal, Node next) {
        this.animal = animal;
        this.next = next;
    }
}
