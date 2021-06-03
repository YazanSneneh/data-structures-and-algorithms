package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    ArrayList<Vertix> vertices = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();

    public Graph(){}
    public Graph(ArrayList<Vertix> vertices) {
        this.vertices = vertices;
    }

    public Integer addNode(Integer value){
        Vertix vertix = new Vertix(value);
        vertices.add(vertix);
        return vertix.value;
    }

       public void addEdge(Vertix src, Vertix dist, Integer weight){
           if(vertices.contains(src) && vertices.contains(dist)){
               Edge edge = new Edge(src, dist, weight);
               edges.add(edge);
           }
       };

    public List getNodes(){
        ArrayList<Integer> values = new ArrayList<>();
        for (int i=0; i<vertices.size(); i++){
            values.add(vertices.get(i).value);
        }
        return values;
    }

    public ArrayList getNeighbors(Integer value){

        ArrayList<Integer> neighbors = new ArrayList();

        for (int i=0; i<edges.size(); i++){
            if(!edges.get(i).src.value.equals(value)){
                neighbors.add(edges.get(i).dist.value);
            }
        }

       return neighbors;
    }

    public Integer Size(){
        return vertices.size();
    }
    public static void main(String [] args){
        Graph graph = new Graph();

        graph.addNode(4);
        graph.addNode(14);
        graph.addNode(15);
        graph.addNode(16);
        graph.addNode(18);
        Vertix v = new Vertix(3);

        graph.addEdge(graph.vertices.get(0),graph.vertices.get(1),1);
        graph.addEdge(graph.vertices.get(0),graph.vertices.get(2),5);
        graph.addEdge(graph.vertices.get(0),graph.vertices.get(3),2);

        graph.addEdge(graph.vertices.get(0),v ,1);

//        for (int i=0; i<vertices.size(); i++){
//            System.out.print(values.add(vertices.get(i).value));
//        }

        System.out.println(graph.getNeighbors(0));


//        List nodes = graph.GetNodes();
//        for (int i=0; i<nodes.size(); i++){
//            System.out.print(nodes.get(i) + " ");
//        }
    }
}
