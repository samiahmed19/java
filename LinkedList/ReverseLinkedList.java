public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
public static ListNode reverseLinkedList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }
public static void printLinkedList(ListNode head) {
        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
    public static boolean palindromeLL(ListNode head1,ListNode head2){
        ListNode curr1=head1;
        ListNode curr2=head2;
        while(curr1!=null && curr2!=null ){
            if(curr1.val!=curr2.val){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        // if(curr1!=null || curr2!=null) return false;
        return true;
    }
public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);

        boolean pal=palindromeLL(head, reversedHead);
        System.out.println(pal);
    }
}