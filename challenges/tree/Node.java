package tree;

public class Node{
    Integer value;
    Node right;
    Node left;

    public Node(){
        this.right = this.left =  null;
    }

    public Node(Integer value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}