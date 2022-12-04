import java.util.*;

class List{
    int val;
    List next;
    List(int val, List next){
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(List head) {
        List slow = head;
        List fast = head;
    
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
        }
    
        if (fast != null)
          slow = slow.next;
        slow = reverseList(slow);
    
        while (slow != null) {
          if (slow.val != head.val)
            return false;
          slow = slow.next;
          head = head.next;
        }
    
        return true;
      }
    
      public static List reverseList(List head) {
        List prev = null;
    
        while (head != null) {
          List next = head.next;
          head.next = prev;
          prev = head;
          head = next;
        }
    
        return prev;
      }

      public static void main(String[] args) {
        List head = new List(1, new List(2, new List(3, new List(2, new List(1, null)))));
        PalindromeLinkedList p = new PalindromeLinkedList();
        System.out.println(p.isPalindrome(head));
      }
    
}
