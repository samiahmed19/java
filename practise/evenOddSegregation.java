// package javacodes;
// import java.util.*;
public class evenOddSegregation
{
	public static void main(String[] args) {
		int a[]={2,3,5,6,4,10,7};
		int left=0;
		int right=0;
		while(right<a.length){
		    if(a[right]%2==0){
		        int temp=a[left];
		        a[left]=a[right];
		        a[right]=temp;
		        left++;
		    }
		    right++;
		}
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
