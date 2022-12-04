import java.util.LinkedList; // Class Which implements queue list etc.
import java.util.Queue;     //queue is an iterface 

public class EnqueueAndDequeue 
{
    public static void main(String[] args) 
    {
        
        Queue<String> queue = new LinkedList<>();
        //to implement Queue

        //Adding In Queue  using `add()` method
        queue.add("Bill Gates");  //enque
        queue.add("Mark  Mark Zuckerberg"); // enque
        queue.add("Elon Musk"); //enquue
        queue.add("Jeff Bezos");
        queue.offer("Donald Trump");   // alternatice enque

        System.out.println("Queue : " + queue); //queue print

         String name = queue.remove();         //Dequeue 
         System.out.println("Removed from queue : " + name );
         System.out.println(queue);
                  

      name= queue.poll();   // altrenative deque method
      System.out.println("Removed from queue : " + name );
      System.out.println(queue);  
    }
}