package BreadthFirst;

import graph.Graph;
import graph.Vertix;

import java.util.*;

public class BreadthFirst {
static  Graph graph = new Graph();
    public static void main(String[] args){

        graph.addNode(4);
        graph.addNode(14);
        graph.addNode(15);
        graph.addNode(16);
        graph.addNode(12);
        graph.addNode(11);
        graph.addNode(20);
        graph.addNode(1111);

        graph.addEdge(graph.vertices.get(0),graph.vertices.get(1),1);
        graph.addEdge(graph.vertices.get(1),graph.vertices.get(2),5);
        graph.addEdge(graph.vertices.get(3),graph.vertices.get(4),2);
        graph.addEdge(graph.vertices.get(4),graph.vertices.get(5),2);

        BreadthFirst breadthFirst = new BreadthFirst();
        List<Vertix> vertices = breadthFirst.breadthFirstTraversal( graph.vertices.get(0));

        System.out.println(vertices);
    }

    public List<Vertix> breadthFirstTraversal(Vertix vertix){
        List<Vertix> nodes = new ArrayList<>();
        Queue<Vertix> breadth = new LinkedList<>();
        HashSet<Vertix> visited = new HashSet<>();
        breadth.add(vertix);
        visited.add(vertix);

        int i = 0;
        while(breadth.size() > i){
             Vertix front = breadth.remove();
             nodes.add(front);

             List<Vertix> items = graph.getNeighbors(front.value);

            for( Vertix v: items ){
                if(!visited.contains(v)){
                    visited.add(v);
                    breadth.add(v);
                }
            }
        }
               return nodes;
    };
}
