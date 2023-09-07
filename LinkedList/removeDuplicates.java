import java.util.HashSet;

public class removeDuplicates {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
                        
        }
        System.out.println("null");
    }
    static Node head;
    public static Node sortll(Node head){
        if(head == null){
            return null;
        }
        Node curr=head;
        HashSet<Integer> hs=new HashSet<>();
        hs.add(curr.data);

        while(curr.next!=null){
            if(hs.contains(curr.next.data)) curr.next=curr.next.next;
            else{
                hs.add(curr.next.data);
                curr=curr.next;
            }
        }
        return head;

    }
    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(12);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next.next.next = new Node(5);

        printll(head);
        Node sorted=sortll(head);
        printll(sorted);
    }
}
