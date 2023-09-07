import java.util.*;
public class stacks {
    public static void sPush(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.print(stack+" ");
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        sPush(stack);
        
    }
}
