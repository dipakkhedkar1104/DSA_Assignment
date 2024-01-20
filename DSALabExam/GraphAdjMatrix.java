/*1. Write a Java program to
	a. Implement a graph using adjacency matrix*/

package DSALabExam;

class Graph {
private boolean adjMatrix[][]; 
private int numVertices;


public Graph(int numVertices) {
 this.numVertices = numVertices;
 adjMatrix = new boolean[numVertices][numVertices];  
}

//to add the edges graph
public void addEdge(int i, int j) {
 adjMatrix[i][j] = true;
 adjMatrix[j][i] = true;
}

// to remove edges
public void removeEdge(int i, int j) {
 adjMatrix[i][j] = false;
 adjMatrix[j][i] = false;
}

public void displayGraph() {
    System.out.println("Graph represented by Adjacency Matrix:");

    // to show column indices
    System.out.print(" ");
    for (int i = 0; i < numVertices; i++) {
        System.out.print(" '"+ i + "'");
    }
    System.out.println();

    // print matrix rows
    for (int i = 0; i < numVertices; i++) {
        System.out.print(i + ": "); //0,1,2,3
      for (boolean j : adjMatrix[i]) {
    	  System.out.print((j ? 1 : 0) + "   ");
      }
        System.out.println();
    }
}
}

public class GraphAdjMatrix {

	public static void main(String args[]) {
		 Graph g = new Graph(4);

		 g.addEdge(0, 1);
		 g.addEdge(0, 2);
		 g.addEdge(1, 2); 
		 g.addEdge(2, 0);
		 g.addEdge(2, 3);

		 g.displayGraph();
		}
}

