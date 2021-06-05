package BreadthFirst;

import graph.Vertix;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirstEdge() {
        assertEquals("[]", BreadthFirst.graph.toString());
    }

    @Test
    public void testBreadthFirstHappyCase() {
        BreadthFirst bf = new BreadthFirst();
        Vertix A = new Vertix(1);
        Vertix B = new Vertix(2);
        BreadthFirst.graph.addEdge(BreadthFirst.graph.vertices.get(0),BreadthFirst.graph.vertices.get(1),1);

        assertEquals("[1, 2]", BreadthFirst.graph.toString());
    }
}