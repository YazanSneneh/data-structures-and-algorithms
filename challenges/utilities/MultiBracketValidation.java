package utilities;

import java.util.HashMap;

public class MultiBracketValidation {
    public boolean multiBracketValidation(String input){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("{",0);
        map.put("}",0);
        map.put("(",0);
        map.put(")",0);
        map.put("[",0);
        map.put("]",0);

        String[] chars = input.split("(?!^)");

        boolean circle = false;
        boolean square = false;
        boolean curly = false;

        for(int i=0; i<chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            } }

    if(map.get("{") == map.get("}")){
                curly = true;
    }

     if(map.get("(") == map.get(")")){
        circle = true;
    }

    if(map.get("[") == map.get("]")){
        square = true;
    }

       if(input.isEmpty()){
           return false;
       }else{
           if(curly && circle && square){
               return true;
           }else{
               return false;
           }
       }
 }

    public static void main(String[] args) {
        MultiBracketValidation app = new MultiBracketValidation();
        System.out.println(app.multiBracketValidation(""));
    }
}
