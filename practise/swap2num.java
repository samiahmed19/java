import java.util.Scanner;

public class swap2num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before sorting a, b : "+a+" "+b);
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}