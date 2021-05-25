package tree;

public class BinarySearchTree {

    public Node add(Integer value, Node root){

        Node newNode = new Node(value);
        if(root == null){
             root = newNode;
             return root;
         }

         if(root.value >value){
               if(root.left== null){
                   root.left = newNode;
               }else{
                   add(value, root.left);
               }
         }

        if(root.value < value){
            if(root.right == null){
                root.right = newNode;
            }else{
                add(value, root.right);
            }
        }

        return newNode;
    }

    public boolean contains(int value, Node root){
          try{
              if(  root !=null || root.value != null ){
                  if(root.getValue() == value) return true;
                  if(root.getValue() < value) return contains(value, root.right);
                  if(root.getValue() > value) return  contains(value,root.left);
              }

          }catch (NullPointerException e){
              return false;
          }
        return false;
    }

public static void main(String[] args){

}
}
