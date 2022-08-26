import java.util.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(Node root) {
      if (root == null)
        return new ArrayList<>();
  
      List<List<Integer>> ans = new ArrayList<>();
      Queue<Node> q = new ArrayDeque<>(Arrays.asList(root));
  
      while (!q.isEmpty()) {
        List<Integer> currLevel = new ArrayList<>();
        for (int sz = q.size(); sz > 0; --sz) {
          Node node = q.poll();
          currLevel.add(node.data);
          if (node.left != null)
            q.offer(node.left);
          if (node.right != null)
            q.offer(node.right);
        }
        ans.add(currLevel);
      }
  
      return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        List<List<Integer>> levelOrder = new ArrayList<>();
        levelOrder = levelOrder(root);

        System.out.print("The LevelOrder Traversal is : ");
        for (int i = 0; i < levelOrder.size(); i++) {
            System.out.print(levelOrder.get(i) + " ");
        }

    }
  }