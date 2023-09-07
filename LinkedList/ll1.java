public class ll1 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static Node head;
    public static void addFrist(int value){
        if(head==null){
            head=new Node(value);
            // System.out.print(head.data);
            return;
        }
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int value){
        
        if(head==null){
            head=new Node(value);
            return;
        }
        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        Node newNode=new Node(value);
        curr.next=newNode;
        // System.out.print(newNode.data);
    }
    public static void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public static void deleteLast(){
        if(head==null) {
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    public static Node reverseKGroup(Node head, int k) {
        if(head==null) return null;
        Node curr=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }
        return prev;
    }
    public static void printll(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
            // System.out.print(curr.data+"->");
                        
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head =new Node(1);
        head.next=new Node(2);
        head.next.next= new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        // printll();
        addFrist(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        // deleteFirst();
        // deleteLast();
        reverseKGroup(head,2);
        printll();

    }
}
