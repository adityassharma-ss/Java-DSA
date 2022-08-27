import java.util.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right= null;
    }
}

public class BalancedBinaryTree {

    public static boolean isBalanced(Node root) {
        return dfsHeight (root) != -1;
    }
    static int dfsHeight (Node root) {
        if (root == null) return 0;
        
        int leftHeight = dfsHeight (root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight (root.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(isBalanced(root));
    }
    
    
    
}
