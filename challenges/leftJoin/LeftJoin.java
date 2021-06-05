package LeftJoin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

public static List LeftJoin(HashMap one, HashMap two){
        String[] set = new String[3];
        List<String[]> list = new ArrayList<>();

      for (Object key: one.keySet()){
           if(!one.get(key).equals(two.get(key))){
               set[0] = (String) key;
               set[1] = (String) one.get(key);
               set[2] = (String) two.get(key);
               list.add(set);
           }else if(one.get(key).equals(two.get(key))){
               set[0] = (String)key;
               set[1] = (String) one.get(key);
               set[2] = null;
               list.add(set);
           }}
        return list;
    }

}
