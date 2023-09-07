public class Stackking {
    static Object[] stack;
    static int size;
    static int top;
    public static void stackds(int len){
        size=len;
        top=-1;
        stack=new Object[size];
    }
    public void spush(Object value){
        if(top==size-1){
            System.out.print("Stack is full");
        }
        else{
            top++;
            stack[top]=value;
        }
    }
    public static Object pop(){
        if(top==-1){
            System.out.print("Stack is empty");
        }
        else{
            int oTop=top;
            top--;
            stack[oTop]=null;
            return stack[oTop];
        }
        return null;
    }
    public static Object peek(){
        return stack[top];
    }
    public static void main(String[] args) {
        Stackking s=new Stackking();
        s.stackds(5);
        s.spush(1);
        s.spush(2);
        s.spush(3);
        s.spush(4);
        s.spush(5);
        for(int i=0;i<size;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.print(s.peek());

    }
}
