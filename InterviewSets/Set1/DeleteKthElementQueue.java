import java.util.*;
 
public class DeleteKthElementQueue{
 
// Function to remove an element from
// the queue
static Queue<Integer> q;
static void remove(int t)
{
 
    // Helper queue to store the elements
    // temporarily.
    Queue<Integer> ref = new LinkedList<>();
    int s = q.size();
    int cnt = 0;
 
    // Finding the value to be removed
    while (!q.isEmpty() && q.peek() != t) {
        ref.add(q.peek());
        q.remove();
        cnt++;
    }
 
    // If element is not found
    if (q.isEmpty()) {
        System.out.print("element not found!!" +"\n");
        while (!ref.isEmpty()) {
 
            // Pushing all the elements back into q
            q.add(ref.peek());
            ref.remove();
        }
    }
 
    // If element is found
    else {
        q.remove();
        while (!ref.isEmpty()) {
 
            // Pushing all the elements back into q
            q.add(ref.peek());
            ref.remove();
        }
        int k = s - cnt - 1;
        while (k-- >0) {
 
            // Pushing elements from front of q to its back
            int p = q.peek();
            q.remove();
            q.add(p);
        }
    }
}
 
// Function to print all the elements
// of the queue.
static void print()
{
    Queue<Integer> qr = new LinkedList<>(q);
    while (!qr.isEmpty()) {
        System.out.print(qr.peek()+ " ");
        qr.remove();
    }
 
    System.out.println();
}
 
// Driver Code
public static void main(String[] args)
{
    q = new LinkedList<>();
 
    // Pushing into the queue
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    print();
 
    // Removing 39 from the queue
    remove(39);
    print();
 
    // Removing 30 from the queue
    remove(30);
    print();
}
}