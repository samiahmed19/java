/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class sumOfPrimeExceptSmallestPrime
{
    public static boolean isPrime(int n){
        // if(n<=1) return false;
        // if (n == 2 || n == 3)
        //     return true;
        // if (n % 2 == 0 || n % 3 == 0)
        //     return false;
        // for (int i = 5; i < Math.sqrt(n); i += 6)
        //     if (n % i == 0 || n % (i + 2) == 0)
        //         return false;
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    int a[]={2,3,5,7,11,13,17,19,23,29};
	    int sum=0;
	    ArrayList<Integer> al=new ArrayList<>();
	    for(int i=0;i<a.length;i++){
	        if(isPrime(a[i])){
	            al.add(a[i]);
	            
	        }
	    }
	    System.out.println(al);
	    for(int i=0;i<al.size();i++){
	        sum+=al.get(i);
	    }
	    Collections.sort(al);
	    int min=Integer.MAX_VALUE;
	    System.out.print("sum is: "+ (sum-al.get(0)) );
	    
	}
}
