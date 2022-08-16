

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(34);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertLast(99);
        list.insert(20,3);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.display();
        System.out.println(list.find(34));

       Doubly list = new Doubly();
       list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(8);
       list.insertFirst(17);
       list.insertLast(83);
       list.insert(8, 65); 

       list.display();
       


    }


    
}
