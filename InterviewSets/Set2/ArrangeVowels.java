// Given a singly linked list of size N containing only English Alphabets. Your task is to complete the function arrangeC&V(), that arranges the consonants and vowel nodes of the list it in such a way that all the vowels nodes come before the consonants while maintaining the order of their arrival.

class Node 
{
    char data;
    Node next;
    Node(char x)
    {
        data=x;
    }
}
public class ArrangeVowels 
{
    public static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ,");
            head=head.next;
        }
        System.out.println();
    }
    public static boolean isVowel(char x)
    {
        if(x== 'a' || x== 'e' || x=='i' || x=='o' || x=='u')
        {
            return true;
        }
        return false;
    }
    public static Node arrange(Node head)
    {
        Node newHead=head;
        Node prevVowel;
        Node curr=head;
        if(head==null)
        {
            return null;
        }
        if(isVowel(head.data))
        {
            prevVowel=head;
        }
        else{
            while(curr.next!=null && !isVowel(curr.next.data))
            {
                curr=curr.next;
            }
            if(curr.next==null)
            {
                return head;
            }
            prevVowel=newHead=curr.next;
            curr.next=curr.next.next;
            prevVowel.next=head;
        }
        while(curr!=null && curr.next!=null)
        {
            if(isVowel(curr.next.data))
            {
                if(curr==prevVowel)
                {
                    prevVowel=curr=curr.next;
                }
                else{
                    Node temp=prevVowel.next;
                    prevVowel.next=curr.next;
                    prevVowel=prevVowel.next;
                    curr.next=curr.next.next;
                    prevVowel.next=temp;
                }
            }
            else
            {
                curr=curr.next;
            }
        }
        return newHead;
    }
    public static void main(String[] args) 
    {
        Node head=new Node('c');
        head.next = new Node('a');
        head.next.next = new Node('l');
        head.next.next.next = new Node('e');
        head.next.next.next.next = new Node('p');
        head.next.next.next.next.next= new Node('o');
        head.next.next.next.next.next.next= new Node('w');
        System.out.println("Input List");
        printList(head);
        head=arrange(head);
        System.out.println("Output List");
        printList(head);
        
    }
}