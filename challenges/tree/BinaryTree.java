package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    List<Integer> nodes = new ArrayList<>();

    public List preOrder(Node root){

        if(root.value == null || root == null)return  null;

        this.nodes.add(root.value);

        if(root.left != null) preOrder(root.left);
        if (root.right !=null)preOrder((root.right));

        return this.nodes;
    }

    public List inOrder(Node root){
        if(root.value == null || root == null) return  null;

        if(root.left !=null) inOrder(root.left);

        this.nodes.add(root.value);

        if (root.right !=null)inOrder(root.right);

        return this.nodes;
    }

    public List postOrder(Node root){
        if(root.value == null || root == null)return  null;

        if(root.left !=null)postOrder(root.left);

        if(root.right !=null)postOrder(root.right);

        this.nodes.add(root.value);
        return  this.nodes;
    }


   public Integer findMaximumValue(Node root){

        try {
            if(root !=null && root.value !=null){
                Node max= root;
                List<Integer> values = this.preOrder(root);
                int total = this.preOrder(root).size();

                for( int i=0; i<total;i++){
                    if( values.get(i) > max.value){
                        max.value = values.get(i);
                    }
                }
                return max.value;
            }
            return null;
        }catch (NullPointerException n){
            return null;
        }
    }

}