import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;


public class Solution2 {

        public static void dfs(char curr,LinkedHashSet<Character> visited,LinkedHashMap<Character,ArrayList<Character>> adjList) {
                System.out.println(curr);
                visited.add(curr);
                for(char ver: adjList.get(curr)) {
                        if(!visited.contains(ver)) {
                                dfs(ver,visited,adjList);
                                
                        }
                }
        }

        public static void main(String[] args) {

//              adj list representation
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
                LinkedHashSet<Character> visited = new LinkedHashSet<>();
                System.out.println("Dfs order: ");

                dfs('A',visited,adjList);
                System.out.println();

  }
          
        }
