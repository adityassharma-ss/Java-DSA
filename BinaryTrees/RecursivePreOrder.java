import java.util.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
        left = right = null;
    }
}

public class RecursivePreOrder {

    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
      }
    
      private static void preOrder(Node root, List<Integer> ans) {
        if (root == null)
          return;
    
        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
      }

      public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        int List;
        List < Integer > preOrder = new ArrayList<> ();
        preOrder = preorderTraversal(root);

        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }
      }
    
}
