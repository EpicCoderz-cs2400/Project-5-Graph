import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

        private static char key;

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
                //              printing the adj list
                System.out.println("adjecency list: ");
                for(char key:adjList.keySet()) {
                        System.out.println(key + ": " + adjList.get(key).toString());
