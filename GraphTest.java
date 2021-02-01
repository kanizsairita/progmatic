package Graph;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    private static int[][] graph = {{0, 1, 1, 1, 0}, {1, 0, 0, 1, 1}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 0, 0, 0}};
    private static List<Node> nodeList;

    @BeforeClass
    public static void before() {
        System.out.println(Graph.checkMatrix(graph));
    }

    @Before
    public void beforeEach() throws Exception {
        nodeList = Graph.changeMatrixToNodeStructure(graph);
    }

    @Test
    public void dfsTest() {
        Graph.dfs(nodeList.get(0));
    }

    @Test
    public void bfsTest() {
        Graph.bfs(nodeList.get(0), nodeList);
    }
}