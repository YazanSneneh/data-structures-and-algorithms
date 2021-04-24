package tree;

public class Node{
    Integer value;
    Node right;
    Node left;

    public Node(){
        this.value = null;
        this.right = this.left =  null;
    };
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

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}