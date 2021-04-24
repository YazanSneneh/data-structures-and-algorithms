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
        if(root == null) return null;
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

//public static void main(String[] args){
//        BinarySearchTree tree = new BinarySearchTree();
//          tree.setRoot(new Node(5));
//          tree.add( 15, tree.root);
//          tree.add( 25, tree.getRoot());
//          tree.add( 4, tree.getRoot());
//          tree.add( 2, tree.getRoot());
//          tree.add( 3, tree.getRoot());
//    System.out.println(tree.add( 3, tree.getRoot()));
//}
}
