public class BinaryTreeRec {
    static Node root;

    class Node {
        int value;
        Node left;
        Node right;
    
        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
    
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    
        return bt;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTreeRec().createBinaryTree();
        System.out.println(bt.root.value);
        System.out.println(bt.root.left.value);
        System.out.println(bt.root.right.value);
        System.out.println(bt.root.left.left.value);
        System.out.println(bt.root.left.right.value);
        System.out.println(bt.root.right.left.value);
        System.out.println(bt.root.right.right.value);
        
    }
    
 
 

}