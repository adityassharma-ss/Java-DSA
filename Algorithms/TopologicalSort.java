import java.util.*;

public class TopologicalSort {
  // This is a directed graph represented as an adjacency list
  private Map<Integer, List<Integer>> graph = new HashMap<>();

  // This method adds a directed edge from node u to node v
  public void addEdge(int u, int v) {
    List<Integer> neighbors = graph.getOrDefault(u, new ArrayList<>());
    neighbors.add(v);
    graph.put(u, neighbors);
  }

  public List<Integer> topologicalSort() {
    // This array will store the topological sort of the graph
    List<Integer> sorted = new ArrayList<>();

    // This set will keep track of the nodes that have been visited
    Set<Integer> visited = new HashSet<>();

    // This stack will be used to implement the depth-first search
    Stack<Integer> stack = new Stack<>();

    // Start the topological sort from every node that has no incoming edges
    for (int node : graph.keySet()) {
      if (!visited.contains(node)) {
        topologicalSort(node, visited, stack);
      }
    }

    // Add the nodes from the stack to the sorted list
    while (!stack.isEmpty()) {
      sorted.add(stack.pop());
    }

    return sorted;
  }

  // This method performs a depth-first search on the given node
  private void topologicalSort(int node, Set<Integer> visited, Stack<Integer> stack) {
    visited.add(node);
    for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
      if (!visited.contains(neighbor)) {
        topologicalSort(neighbor, visited, stack);
      }
    }
    stack.push(node);
  }

  public static void main(String[] args) {
    TopologicalSort topologicalSort = new TopologicalSort();
    // Add some edges to the graph
    topologicalSort.addEdge(1, 2);
    topologicalSort.addEdge(1, 3);
    topologicalSort.addEdge(2, 4);
    topologicalSort.addEdge(2, 5);
    topologicalSort.addEdge(3, 5);
    topologicalSort.addEdge(4, 6);
    topologicalSort.addEdge(5, 6);

    // Perform the topological sort on the graph
    List<Integer> sorted = topologicalSort.topologicalSort();
    System.out.println(sorted); // [1, 3, 2, 5, 4, 6]
  }
}
