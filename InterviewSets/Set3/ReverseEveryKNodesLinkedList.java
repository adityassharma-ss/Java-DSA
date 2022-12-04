public class ReverseEveryKNodesLinkedList {

    ListNode{
        int val;
        ListNode next;
        void ListNode(int val){
            val = val;
        }
    }
    public int getLength(ListNode head) {
        int length = 0;
        for (ListNode curr = head; curr != null; curr = curr.next)
          ++length;
        return length;
      }
       public ListNode reverseKGroup(ListNode head, int k) {
            if (k <= 1 || head == null) {
                return head;
            }
    
            ListNode current = head;
            ListNode prev = null;
    
            int length = getLength(head);
            int count = length / k;
            while (count > 0) {
                ListNode last = prev;
                ListNode newEnd = current;
    
                ListNode next = current.next;
                for (int i = 0; current != null && i < k; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if (next != null) {
                        next = next.next;
                    }
                }
    
                if (last != null) {
                    last.next = prev;
                } else {
                    head = prev;
                }
    
                newEnd.next = current;
    
                prev = newEnd;
                count--;
            }
            return head;
        }
        public static void main(String[] args) {
            
            
        }
    
}
