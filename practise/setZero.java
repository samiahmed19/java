/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class setZero
{
    public static void setZero(int[][] a){	    
	HashSet<Integer> row=new HashSet<>();
	HashSet<Integer> col=new HashSet<>();
	   for(int i=0;i<a.length;i++){
	       for(int j=0;j<a.length;j++){
	           if(a[i][j]==0){
	               row.add(i);
	               col.add(j);
	           }
	       }
	   }
	   for(int i:row){
	       for(int j=0;j<a.length;j++){
	           a[i][j]=0;
	       }
	   }
	   for(int i:col){
	       for(int j=0;j<a.length;j++){
	           a[j][i]=0;
	       }
	   }
        
    }
	public static void main(String[] args) {
		int[][] a={{1,2,3},
	    	        {4,0,6},
	    	        {7,8,9}};
	    setZero(a);
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[0].length;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
