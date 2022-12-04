import java.util.List;

class Node
{
    int data;
    Node next, random;
 
    // Constructor
    Node(int data) {
        this.data = data;
    }
}
 
public class CloneLinkedList
{
    // Recursive function to print a linked list
    public static void traverse(Node head)
    {
        // traverse the linked list
        while (head != null)
        {
            // print current node data and random pointer data
            if (head.random != null) {
                System.out.print(head.data + "(" + head.random.data + ") —> ");
            }
            else {
                System.out.print(head.data + "(" + "X" + ") —> ");
            }
 
            // advance to the next node
            head = head.next;
        }
 
        System.out.println("null");
    }
 
    // Function to clone a linked list having random pointers
    public static Node cloneLinkedList(Node head)
    {
        /* 1. Create a duplicate of each node of the original linked list */
 
        // traverse the original linked list
        Node curr = head;
        while (curr != null)
        {
            // take a pointer to the next node in the original list
            Node next = curr.next;
 
            // duplicate each node of the linked list
            Node dup = new Node(curr.data);
 
            // associate each duplicate node with the next child of the original node
            curr.next = dup;
            dup.next = next;
 
            // advance to the next node in the original list
            curr = next;
        }
 
        /* 2. Update the random pointers of the duplicated nodes */
 
        // traverse the modified list
        curr = head;
        while (curr != null)
        {
            // if a random pointer for the original node exists, set it for the clone
            if (curr.random != null) {
                (curr.next).random = (curr.random).next;
            }
 
            // advance to the next node in the original list
            curr = (curr.next).next;
        }
 
        /* 3. Extract the duplicate nodes from the modified list */
 
        // construct a dummy node whose next pointer points to the head
        // of the cloned linked list
        Node dummy = new Node(-1);
 
        // maintain a tail node for the clone
        Node tail = dummy;
 
        // traverse the modified list
        curr = head;
        while (curr != null)
        {
            // take a pointer to the next node in the original list
            Node next = curr.next.next;
 
            // extract the duplicate
            Node dup = curr.next;
            tail.next = dup;
            tail = dup;
 
            // restore the original linked list
            curr.next = next;
 
            // advance to the next node in the original list
            curr = next;
        }
 
        // return head node of the cloned list
        return dummy.next;
    }
 
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
 
        head.random = head.next.next.next;
        head.next.next.random = head.next;
 
        System.out.print("Original linked list:\n");
        traverse(head);
 
        Node clone = cloneLinkedList(head);
 
        System.out.print("\nCloned linked list:\n");
        traverse(clone);
    }
}

