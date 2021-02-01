package Graph;

import java.util.ArrayList;
import java.util.List;


public class Graph {


    private static int[][] graph = {{0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 0, 0, 0}};
    private static List<Node> nodeList;

    public static boolean checkMatrix(int[][] graph) {

        if (graph.length != graph[0].length) return false;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] != graph[j][i]) return false;
            }
        }
        return true;
    }


    public static List<Node> changeMatrixToNodeStructure(int[][] graph) throws Exception {

        if (graph.length != graph[0].length) throw new Exception("Graph has to be nxn");

        List<Node> graphNodes = new ArrayList<Node>();
        for (int i = 0; i < graph.length; i++) {
            Node n = new Node();
            n.setId(i);
            graphNodes.add(n);
        }
        for (int i = 0; i < graph.length; i++) {
            Node parent = graphNodes.get(i);
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 1) {
                    parent.getChildren().add(graphNodes.get(j));
                }
            }
        }
        return graphNodes;

    }

    public static void dfs(Node n) {

        System.out.println(n);
        n.setPassed(true);
        for (Node child : n.getChildren()) {
            if (!child.isPassed()) dfs(child);
        }

    }

    public static void bfs(Node n, List<Node> nodeList) {
        if (n.equals(nodeList.get(0))) System.out.println(n);
        n.setPassed(true);
        for (Node child : n.getChildren()) {
            if (!child.isPassed()) System.out.println(child);
        }
        for (Node child : n.getChildren()) {
            if (!child.isPassed()) bfs(child, nodeList);
        }


    }


}
