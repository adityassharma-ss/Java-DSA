class Node {
    int data;
    Node next;
    public int value;
    Node(int value)
    {
        this.data = value;
        next = null;
    }
}

public class WeirdSwap {
    public static void weirdSwap(Node head, int k){

        int dupHead=head;
        int count=0;
        //1-2-3-4-5-6-7-8;k=4;4-2-3-1-5-6-7-8
        if(head==null) return;
        int rootVal=head.value;//rootVal=1
        count++;//1
        while(head.next!=null){
          if(count%k==0){// if count%k ==0 , then swap //count=4
          int tmp=rootVal;//node 0
          rootVal=head.value;//move value at current node(multiple of k) to root
          head.value=tmp;//move root value to current node.//1-2-3-1-5-6-7-8.
          
          for(int i=0;i<=(count-k);i++){//(4-4),(8-4)
            dupHead=dupHead.next;
          }
          dupHead=rootVal;//4-3-2-1-5-6-7-8
          Node rootValue = head.next;// for k+1
          }
          count++;//increment count
        }
        
        }
    
}
