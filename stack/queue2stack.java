import java.util.*;
public  class queue2stack<T> {
   private Stack<T> insertion;
   private Stack<T> deletion;
    public  queue2stack(){
        insertion=new Stack<>();
        deletion=new Stack<>();
    }
    public void enqueue(T item){
        insertion.push(item);
        // return  insertion;
    }
    public T dequeue(){
        // deletion.pop();
        if(deletion.isEmpty()){
            System.out.println("stack is empty");
        }
         while(!insertion.isEmpty()){
                deletion.push(insertion.pop());
            }
        
        return deletion.pop();
    }
    public T peek(){
        if(insertion.isEmpty()){
            // System.out.println("no element");
            return null;
        }
        while(!insertion.isEmpty()){
            deletion.push(insertion.pop());
        }
        return deletion.peek();
        
    }
    public static void main(String[] args) {
        queue2stack q=new queue2stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.peek());
    //     System.out.println("top element in deletion element is : "+q.peek());
        System.out.println(q.insertion);
    //     System.out.println(q.deletion);
    }
}
