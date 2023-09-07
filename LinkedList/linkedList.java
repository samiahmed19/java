public class linkedList {
    static class Node{
        public int i = 0;
        int data;
        Node next;
        public int length=0;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node head;
    
    public static void addFirst(int data){
        if(head == null){
            head = new Node(data);
            System.out.print(head.data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // public static void addLast(int data){
    //     if(head == null){
    //         head = new Node(data);
    //         return;
    //     }
    //     Node curr = head;
    //     while(curr.next != null){
    //         curr = curr.next;
    //     }
    //     Node newNode = new Node(data);
    //     curr.next = newNode;
    // }
    public static void search(int value){
        Node curr=head;
        int i=0;
        while(curr!=null){
            if(curr.data==value&& i<=curr.length){
                
                System.out.println("element is present"+curr.data);
            }
          
            curr=curr.next;
        }
        
    }
    public static void revesePrint(Node head){
        // Node curr=head;
        if(head==null) return;
        revesePrint(head.next);
        System.out.print(head.data+" ");
    }
    public static void printLL(){
        Node curr=head;
        while(curr!=null ){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
		// head = new Node(1);
		// head.next = new Node(2);
		// head.next.next = new Node(3);
		// head.next.next.next  = new Node(4);
		// head.next.next.next.next = new Node(5);
        addFirst(0);
        // addLast(6);
        // search(4);
        // printLL();
        // revesePrint(head);
        // printLL();
        // printLL();
    }

}
