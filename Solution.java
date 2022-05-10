import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

        public static void bfs(String[] args) {

                                LinkedHashMap<Character,ArrayList<Character>> adjList = new LinkedHashMap<>();
                                adjList.put('A',new ArrayList<>(List.of('D','B')));
                                adjList.put('B',new ArrayList<>(List.of('E')));
                                adjList.put('C',new ArrayList<>(List.of('B')));
                                adjList.put('D',new ArrayList<>(List.of('G')));
                                adjList.put('E',new ArrayList<>(List.of('H','F')));
                                adjList.put('F',new ArrayList<>(List.of('C', 'H')));
                                adjList.put('G' ,new ArrayList<>(List.of('H')));
                                adjList.put('H' ,new ArrayList<>(List.of('I')));
                                adjList.put('I' ,new ArrayList<>(List.of('F')));

               System.out.println("adjecency list: ");
               for(char key:adjList.keySet()) {
                       System.out.println(key + ": " + adjList.get(key).toString());
               }
               int adjMat[][] = {
                               {0,1,0,1,0,0},
                               {0,0,1,0,0,0},
                               {0,0,0,0,1,0},
                               {0,0,1,0,0,0},
                               {0,0,0,1,0,1},
                               {0,0,1,0,0,0}
               };
               System.out.println("adjecency matrix: ");
               for(int[] arr:adjMat) {
                       System.out.println(Arrays.toString(arr));
               }
               
       
       }

}