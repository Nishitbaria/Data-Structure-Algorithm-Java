import java.util.ArrayList;
import java.util.*;

public class Graph {
    
public static class Edge{
int src;
int dest;
int weght;
      public Edge(int s, int d, int w){
         this.src = s;
          this.dest = d;
           this.weght = w;
}

}




    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] Graph = new ArrayList[V];   
       
        for(int i=0 ; i < V; i++){
    Graph [i] = new ArrayList<>() ; 
        }
    //0th vertix 
    Graph[0].add(new Edge(0, 1, 5)); 
    
    //first vertix 
    Graph[1].add(new Edge(1, 0, 5)); 
    Graph[1].add(new Edge(1, 2, 1)); 
    Graph[1].add(new Edge(1, 3, 3));
    
    //second vertix
    Graph[2].add(new Edge(2, 1, 1));
    Graph[2].add(new Edge(2, 3, 2));
    Graph[2].add(new Edge(2, 4, 2));

   // third vertix
   Graph[3].add(new Edge(3, 1, 3));
   Graph[3].add(new Edge(3, 2, 1));

//4th vertix
Graph[4].add(new Edge(4, 2, 2));



//2nd neighboar  printing
for(int i=0 ; i< Graph[2].size() ; i++ ){
   Edge e = Graph[2].get(i);
   System.out.println(e.dest); 
}





    
    
    }

}
