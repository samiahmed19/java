public class mergeSort {
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
    
    static Node head1;
    static Node head2;
    public static Node merge(Node head1, Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node mhead;
        if(head1.data <= head2.data){
            mhead=head1;
            mhead.next=merge(head1.next, head2);
        }
        else{
            mhead=head2;
            mhead.next=merge(head1, head2.next);
        }
        return mhead;
    }
    public static Node mergesort(Node head){
        if(head==null || head.next== null){
            return head;
        }
        Node middle = findmiddle(head);
        Node nextMiddle = middle.next;
        middle.next=null;
        
        Node left=mergesort(head);//start
        Node right=mergesort(nextMiddle);//mid+1
        return merge(left, right);//mergesort(start,mid+1)
    }
    public static Node findmiddle(Node head){
        if (head == null) return head;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        System.out.println("List 1: ");
        
        head1 =new Node(25);
        head1.next=new Node(35);
        head1.next.next= new Node(4);
        head1.next.next.next=new Node(12);
        head1.next.next.next.next=new Node(36);
        head1.next.next.next.next.next= new Node(48);
        printll(head1);

        System.out.println("List 2: ");
        
        head2 =new Node(8);
        head2.next=new Node(32);
        head2.next.next= new Node(22);
        head2.next.next.next=new Node(45);
        head2.next.next.next.next=new Node(63);
        head2.next.next.next.next.next= new Node(49);
        printll(head2);

        Node merged=merge(head1,head2);
        Node sort=mergesort(merged);

        printll(sort);

    }
}
