//package graph;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class GraphTest {
//    Graph graph = new Graph();
//
//    @Test
//    public void addVertixTest(){
//        graph.addNode(4);
//        graph.addNode(14);
//      assertEquals(graph.vertices.size(),2 );
//    }
//
//    @Test
//    public void addEdgeTest(){
//        graph.addNode(4);
//        graph.addNode(14);
//        graph.addNode(15);
//        graph.addNode(16);
//        graph.addNode(18);
//
//        graph.addEdge(graph.vertices.get(0),graph.vertices.get(1),1);
//        graph.addEdge(graph.vertices.get(0),graph.vertices.get(2),5);
//        graph.addEdge(graph.vertices.get(0),graph.vertices.get(3),2);
//        Edge actual = graph.edges.get(0);
//
//        assertNotNull(graph.edges);
//    }
//
//
//
//    @Test
//    public void getNodesTest(){
//
//        graph.addNode(4);
//        graph.addNode(14);
//        graph.addNode(15);
//        graph.addNode(16);
//        graph.addNode(18);
//
//        assertNotNull(graph.getNodes());
//    }
//
//    @Test
//    public void sizeMethodTest(){
//
//        graph.addNode(4);
//        graph.addNode(14);
//
//        int actual = graph.Size();
//        int expected = 2;
//
//        assertEquals(expected, actual);
//    }
//
//}