public class stackll {
    static class Node {
        int data;
        Node next;
        public Node(int d) {
            data=d;
        }
    }
    
    public static class StackUsingLL {
        static int size=0;
        static Node head=null;
        static Node tail=null;
        public  static void push(int value) {
            Node n1=new  Node(value);
            if(size==0) {
                head=n1;
                tail=n1;
            }
            else {
                tail.next=n1;
                n1.next=null;
            }
            size+=1;
        }
        public void deleteAtLast() {
            if(head==null) {
                System.out.println("The list is empty");
                return;
            }
            size--;
            if(head.next==null) {
                head=null;
                return;
            }
    //        Node node=new Node();
            Node prevNode=head;
            Node current=head.next;
            while(current.next!=null) {
                prevNode=prevNode.next;
                current=current.next;
            }
            prevNode.next=null;
        }
        public static void display() {
            Node current=head;
            for(int i=0;i<size;i++) {
                System.out.println(current.data +"->");
                current=current.next;
            }
        }
    
        public static void main(String[] args) {
            // StackUsingLL S=new StackUsingLL();
            push(10);
            push(20);
            push(30);
            push(40);
            push(50);
            display();
        }
    
    }
}
