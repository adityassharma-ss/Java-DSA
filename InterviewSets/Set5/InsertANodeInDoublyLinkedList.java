import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class InsertANodeInDoublyLinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        ListNode newHead = insert(head, 6, 2);
        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public static ListNode insert(ListNode head, int data, int position){
        ListNode newNode = new ListNode(data);
        if(position == 0){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        ListNode curr = head;
        int count = 0;
        while(count < position - 1){
            curr = curr.next;
            count++;
        }
        ListNode next = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = next;
        if(next != null){
            next.prev = newNode;
        }
        return head;
    }
}
