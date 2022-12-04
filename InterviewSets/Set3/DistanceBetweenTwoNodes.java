class Node
{
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class DistanceBetweenTwoNodes
{
    // Helper function to check if a given node is present in a binary tree or not
    public static boolean isNodePresent(Node root, Node node)
    {
        // base case
        if (root == null) {
            return false;
        }
 
        // if the node is found, return true
        if (root == node) {
            return true;
        }
 
        // return true if the node is found in the left or right subtree
        return isNodePresent(root.left, node) || isNodePresent(root.right, node);
    }
 
    // Helper function to find the level of a given node present in a binary tree
    public static int findLevel(Node root, Node node, int level)
    {
        // base case
        if (root == null) {
            return Integer.MIN_VALUE;
        }
 
        // return level if the node is found
        if (root == node) {
            return level;
        }
 
        // search node in the left subtree
        int left = findLevel(root.left, node, level + 1);
 
        // if the node is found in the left subtree, return the left child
        if (left != Integer.MIN_VALUE) {
            return left;
        }
 
        // otherwise, continue the search in the right subtree
        return findLevel(root.right, node, level + 1);
    }
 
    // Function to find the lowest common ancestor of given nodes `x` and `y`,
    // where both `x` and `y` are present in the binary tree.
    public static Node findLCA(Node root, Node x, Node y)
    {
        // base case 1: if the tree is empty
        if (root == null) {
            return null;
        }
 
        // base case 2: if either `x` or `y` is found
        if (root == x || root == y) {
            return root;
        }
 
        // recursively check if `x` or `y` exists in the left subtree
        Node left = findLCA(root.left, x, y);
 
        // recursively check if `x` or `y` exists in the right subtree
        Node right = findLCA(root.right, x, y);
 
        // if `x` is found in one subtree and `y` is found in the other subtree,
        // update lca to the current node
        if (left != null && right != null) {
            return root;
        }
 
        // if `x` and `y` exist in the left subtree
        if (left != null) {
            return left;
        }
 
        // if `x` and `y` exist in the right subtree
        if (right != null) {
            return right;
        }
 
        return null;
    }
    public static int findDistance(Node root, Node x, Node y)
    {
        
        Node lca = null;
        if (isNodePresent(root, y) && isNodePresent(root, x)) {
            lca = findLCA(root, x, y);
        }
        else {
            return Integer.MIN_VALUE;
        }

        return findLevel(lca, x, 0) + findLevel(lca, y, 0);
        
    }
    public static void main(String[] args)
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.right.right = new Node(8);

        // find the distance between node 7 and node 6
        System.out.print(findDistance(root, root.right.left.left, root.right.right));
    }
}
