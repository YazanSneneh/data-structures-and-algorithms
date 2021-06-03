package graph;

public class Edge {
    Vertix src;
    Vertix dist;
    Integer weight;

    public Edge(){}
    public Edge(Vertix src, Vertix dist, Integer weight) {
        this.src = src;
        this.dist = dist;
        this.weight = weight;
    }

}
