public class SearchBST {

   public class Node {
       //instance variable of Node class
       public int data;
       public Node left;
       public Node right;

       //constructor
       public Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }
   
   // instance variable
   public Node root;

   // constructor for initialise the root to null BYDEFAULT
   public SearchBST() {
       this.root = null;
   }

   // insert method to insert the new Date
   public void insert(int newData) {
       this.root = insert(root, newData);
   }

   public Node insert(Node root, int newData) {
       // Base Case: root is null or not
       if (root == null) {
           // Insert the new data, if root is null.
           root = new Node(newData);
           // return the current root to his sub tree
           return root;
       }
       // Here checking for root data is greater or equal to newData or not
       else if (root.data >= newData) {
           // if current root data is greater than the new data then now process the left sub-tree
           root.left = insert(root.left, newData);
       } else {
           // if current root data is less than the new data then now process the right sub-tree
           root.right = insert(root.right, newData);
       }
       return root;
   }

   // method for search the data , is data is present or not in the tree ?
   public boolean search(int data) {
       return search(this.root, data);
   }

   private boolean search(Node root, int data) {
       if (root == null) {
           return false;
       } else if (root.data == data) {
           return true;
       } else if (root.data > data) {
           return search(root.left, data);
       }
       return search(root.right, data);
   }

   //Traversal
   public void preorder() {
       preorder(root);
       System.out.println();
   }

   public void preorder(Node root) {
       if (root == null) {
           return;
       }
       System.out.print(root.data + " ");
       preorder(root.left);
       preorder(root.right);
   }

   public static void main(String[] args) {
       // Creating the object of BinarySearchTree class
       SearchBST bst = new SearchBST();
       // call the method insert
       bst.insert(8);
       bst.insert(5);
       bst.insert(9);
       bst.insert(3);
       bst.insert(7);
       bst.preorder();
       System.out.println(bst.search(7));
       
   }

public void deleteANode(DeleteNode.Node node) {
}
}