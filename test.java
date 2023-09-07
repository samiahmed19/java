class Node{
    public static  Node current;
    public Object item;
    public Node next;//pointing to next node
}
public class test {
    private int size;
    private Node head;
    private Node current;
    private Object next;

   public test(){
        this.size=0;
        this.head= null;
        // this.next=null; 
   }
   public void insertingnode(String i){
    Node node= new Node();
    node.item= i;
    Node.current=this.head;
    if (this.head==null){
        this.head=node;
        this.head.next= null;
        this.size=1;
        System.out.println(this.head.toString());
    }else{
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.next=null;
        this.size+=1;
    }
   }
}