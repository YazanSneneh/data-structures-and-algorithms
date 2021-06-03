package LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest {
    HashMap<String, String> one = new HashMap<>();
    HashMap<String, String> two = new HashMap<>();

    @Test
    public void leftJoinTestEdgeCase(){
           List actual = LeftJoin.LeftJoin(one, two);
           List<String[]> expected = new ArrayList();

          assertEquals(actual, expected);
    }
    @Test
    public void leftJoinTestHappyPath(){

        one.put("fond", "enamored");
        one.put("wrath", "angered");
        one.put("diligent", "employed");
        one.put("outfit", "garb");
        one.put("guide", "usher");

        two.put("fond", "averse");
        two.put("wrath", "delight");
        two.put("diligent", "idle");
        two.put("guide", "follow");
        two.put("flow", "jam");

        List actual = LeftJoin.LeftJoin(one, two);
        String[] actualZero = (String[]) actual.get(0);

        String[] expected = {"fond","enamored","averse"};

        assertArrayEquals( expected,actualZero);
    }

    @Test
    public void leftJoinTestFailCase(){
        one.put("fond", "enamored");
        one.put("wrath", "angered");
        one.put("diligent", "employed");
        one.put("outfit", "garb");
        one.put("guide", "usher");

        two.put("fond", "averse");
        two.put("wrath", "delight");
        two.put("diligent", "idle");
        two.put("guide", "follow");
        two.put("flow", "jam");

        List list = LeftJoin.LeftJoin(one, two);
        int size = list.size();
        int expected = 5;

           assertEquals(expected, size );

    }

}