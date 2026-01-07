import java.util.LinkedList;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}

  }
public class Main {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;

    }
    public static void main(String[] args) {
    }
}