// package javacodes;
//25-4-2023
//sum of all fibonacci numbers
import java.util.*;
public class fiboncci{
    public static int sumFib(int n) {
        if(n<=0) return -1;
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        int sum=a+b;
        for(int i=0;i<n-2;i++){
            int f=a+b;
            sum+=f;
            a=b;
            b=f;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumFib(n)+" ");
        
    }
}