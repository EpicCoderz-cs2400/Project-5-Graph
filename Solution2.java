import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
//      displays the dfs order of the graph
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
                adjList.put('A',new ArrayList<>(List.of('B','D')));
                adjList.put('B',new ArrayList<>(List.of('C')));
                adjList.put('C',new ArrayList<>(List.of('E')));
                adjList.put('D',new ArrayList<>(List.of('C')));
                adjList.put('E',new ArrayList<>(List.of('D','F')));
                adjList.put('F',new ArrayList<>(List.of('C')));
                LinkedHashSet<Character> visited = new LinkedHashSet<>();
                System.out.println("Dfs order: ");
//              calls the dfs method to prints the dfs order
                dfs('A',visited,adjList);
                System.out.println();
                
                

        
        }

}