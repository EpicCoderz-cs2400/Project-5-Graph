import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;


public class Solution2 {
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

