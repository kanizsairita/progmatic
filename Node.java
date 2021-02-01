package Graph;

import java.util.*;

public class Node {

    private int id;
    private Set<Node> children=new LinkedHashSet<Node>();
    private Node parent;
    private boolean passed;

    public Node(int id,  Set<Node> children) {
        this.id = id;
        this.children = children;
        passed=false;
    }

    public Node() {
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }


    public Set<Node> getChildren() {
        return children;
    }

    public void setChildren(Set<Node> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", children=" + children.size() +
                '}';
    }
}
