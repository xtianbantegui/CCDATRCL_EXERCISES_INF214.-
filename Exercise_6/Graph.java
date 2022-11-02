public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 18;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "CB";
        myGraph.edge[0].dest = "Aaron";

        // Edge 2
        myGraph.edge[1].src = "CB";
        myGraph.edge[1].dest = "Ced";

        // Edge 3
        myGraph.edge[2].src = "CB";
        myGraph.edge[2].dest = "Carla";

        // Edge 4
        myGraph.edge[3].src = "CB";
        myGraph.edge[3].dest = "Pau";

        // Edge 5
        myGraph.edge[4].src = "CB";
        myGraph.edge[4].dest = "Angel";
        
        // Edge 6
        myGraph.edge[5].src = "CB";
        myGraph.edge[5].dest = "Hez";
        
        // Edge 7
        myGraph.edge[6].src = "Aaron";
        myGraph.edge[6].dest = "Winona";
        
        // Edge 8
        myGraph.edge[7].src = "Aaron";
        myGraph.edge[7].dest = "Carla";
        
        // Edge 9
        myGraph.edge[8].src = "Ced";
        myGraph.edge[8].dest = "Atong";
        
        // Edge 10
        myGraph.edge[9].src = "Ced";
        myGraph.edge[9].dest = "Hez";
        
        // Edge 11
        myGraph.edge[10].src = "Carla";
        myGraph.edge[10].dest = "Ray";
        
        // Edge 12
        myGraph.edge[11].src = "Carla";
        myGraph.edge[11].dest = "Winona";
        
        // Edge 13
        myGraph.edge[12].src = "Pau";
        myGraph.edge[12].dest = "Atong";
        
        // Edge 14
        myGraph.edge[13].src = "Pau";
        myGraph.edge[13].dest = "Barbs";
        
        // Edge 15
        myGraph.edge[14].src = "Angel";
        myGraph.edge[14].dest = "Winona";
        
        // Edge 16
        myGraph.edge[15].src = "Angel";
        myGraph.edge[15].dest = "Ray";
        
        // Edge 17
        myGraph.edge[16].src = "Angel";
        myGraph.edge[16].dest = "Hez";
        
        // Edge 18
        myGraph.edge[17].src = "Hez";
        myGraph.edge[17].dest = "Barbs";
        
        
        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
