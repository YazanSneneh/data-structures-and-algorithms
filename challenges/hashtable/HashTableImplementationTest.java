package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableImplementationTest {
    Hashtable<String> hash = new Hashtable<String>(15);

    @Test
    public void addMethodEdgeCase(){
        hash.add(1, "Yazan");
        boolean expected = true;
        assertEquals("should add to correct position", expected,  hash.contains(1));
    }
    @Test
    public void addMethodHappyCase(){
        hash.add(2, "Omar");
        boolean expected = true;
        assertEquals("should add to correct position", expected,  hash.contains(2));
    }

    @Test
    public void getMethodEdgeCase(){
        assertEquals("should result to null", null,  hash.get(2));

    }
    @Test
    public void getMethodHappyCase(){
        hash.add(2, "Omar");
        String expected = "Omar";
        assertEquals("should get to correct value", expected,  hash.get(2));
    }

    @Test
    public void containsMethodEdgeCase(){
        assertEquals(false,  hash.contains(2));
    }
    @Test
    public void containsMethodHappyCase(){
        assertEquals("should add to correct position", false,  hash.contains(2));
    }
    @Test
    public void containsMethodHappyCaseValue(){
        hash.add(2, "Omar");
        String expected = "Omar";
        assertEquals("should add to correct position", true,  hash.contains(2));
    }

}
