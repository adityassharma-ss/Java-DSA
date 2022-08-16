import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0) );
        System.out.println(list.get(1) );
        
        System.out.println(list);
        System.out.println(list.set(2, 5) );
        System.out.println(list);
        
    }
    
}
