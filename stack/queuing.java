public class queuing {
    static int front,rear;
    static int size;
    static Object[] queue;
    public static void queueds(int len){
        size=0;
        front=0;
        rear=len-1;
        queue=new Object[len];
    }
    public static boolean isFull(Object q){
        return false;

        // return queuing.size==queuing.len;

    }
    public static void enqueue(int data){

    }
    public static Object peek(){
        return queue[front];
    }
}
