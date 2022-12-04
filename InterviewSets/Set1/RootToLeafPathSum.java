import java.util.*;

class Node {
    int data;
    Node left, right;
 
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}

public class RootToLeafPathSum{
    public static Node root;

    public static boolean hasPathSum(Node node, int sum)
    {
        if (root == null)
            return false;
        boolean ans = false;
        int subSum = sum - node.data;
        if (subSum == 0 && node.left == null
            && node.right == null)
            return (ans = true);
        if (node.left != null)
 
            
            ans = ans || hasPathSum(node.left, subSum);
 
        if (node.right != null)
 
            
            ans = ans || hasPathSum(node.right, subSum);
        return (ans);
    }

    public static void main(String args[])
    {
        int sum = 21;

        RootToLeafPathSum tree = new RootToLeafPathSum();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
         
          // Function call
        if (tree.hasPathSum(tree.root, sum))
            System.out.println(
                "There is a root to leaf path with sum "
                + sum);
        else
            System.out.println(
                "There is no root to leaf path with sum "
                + sum);
    }

}



