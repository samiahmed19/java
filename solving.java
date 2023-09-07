import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class solving {
    // static Stack<Character> undo=new Stack<>();
    // static Stack<Character> redo=new Stack<>();
    // public static void write(Stack<Character> undo,char x){
    //     undo.push(x);
    // }
    // public static void undo(Stack<Character> undo,Stack<Character> redo){
    //     char x=(char)undo.peek();
    //     undo.pop();
    //     redo.push(x);
    // }
    // public static void redo(Stack<Character> undo,Stack<Character> redo){
    //     char x=(char)redo.peek();
    //     redo.pop();
    //     undo.push(x);
    // }
    // public static void read(Stack<Character> undo){
    //     Stack<Character> rev=new Stack<>();
    //     while(undo.size()>0){
    //         rev.push(undo.peek());
    //         undo.pop();
    //     }
    //     while(rev.size()>0){
    //         System.out.print(rev.peek());
    //         undo.push(rev.peek());
    //         rev.pop();
    //     }
    //     System.out.print(" ");
    // }
    // public static void query(String[] q){
    //     int n=q.length;
    //     for(int i=0;i<n;i++){
    //         if(q[i]=="undo") undo(undo,redo);
    //         if(q[i]=="redo") redo(undo,redo);
    //         if(q[i]=="read") read(undo);
    //         else write(undo,q[i].charAt(i));
    //     }
    // }
    public static int ascciSum(String s){
        int hashcode=0;
        for(int i=0;i<s.length();i++){
            hashcode+=s.charAt(i);
        }
        return hashcode;
    }
    public static void main(String[] args) {
        // int[][] a1={{1,2,3},{4,5,6},{7,8,9}};
        // int[][] a2={{9,8,7},{6,5,4},{3,2,1}};
        // int[][] sum=new int[3][3];
        // for(int i=0;i<a1.length;i++){
        //     for(int j=0;j<a1[0].length;j++){
        //         sum[i][j]= a1[i][j]+a2[i][j];
                
        //         System.out.print(sum[i][j]+" ");    
        //     }
        //     System.out.println();
        // }
        // String[] q={"write a","write b","write c","undo","read","redo","read"};
        // query(q);  
        // String s="sami" ;
        // System.out.println(ascciSum(s)+" "); 

        Map<Integer, String> dataMap = new HashMap<>();

        String name = "sami";
        int hashCode = name.hashCode();

        // Key => hashCode
        dataMap.put(hashCode,name);
        String outputName = dataMap.get(hashCode); 

        System.out.println("Name: " + outputName);
        System.out.println("code: " + hashCode);
    
    }
}
