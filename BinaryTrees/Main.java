public class Main {
    class Node {
        int key;
        Node left, right;
        public char[] value;
      
        public Node(int item) {
        key = item;
        left = right = null;
        }
      }

      public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
      }
    
}
