// Given an array of integers and a target sum, find two numbers in the array
// that add up to the target sum.

// Create a class called TwoSum.
// Define a method named twoSum that takes an array of integers (nums) and a
// target sum (target) as parameters and returns an array of two integers.
// Inside the twoSum method, initialize two nested loops. The outer loop will
// iterate from i = 0 to nums.length - 1.
// Inside the outer loop, initialize the inner loop. It will iterate from j = i
// + 1 to nums.length - 1.
// Within the inner loop, check if the sum of nums[i] and nums[j] equals the
// target sum:
// If the sum is equal to the target, return a new array with i and j as
// elements.
// If no pair is found within the loops, throw an IllegalArgumentException with
// an appropriate error message indicating that no two numbers add up to the
// target sum.
// In the main method, create an instance of the TwoSum class.
// Define an array of integers (nums) and assign values to it.
// Define a target sum (target).
// Call the twoSum method with the nums and target as arguments, and store the
// result in an array (result).
// Print the elements of the result array to display the indices of the two
// numbers that add up to the target sum.


import java.util.*;
class twoSum{
    public static int[] twosum(int[] a,int tar){
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         try{
        //             if(a[i]+a[j]==tar) {
        //                 return new int[]{i,j};
        //             }
        //         }
        //         catch(IllegalArgumentException e){
        //             System.out.println(e+" ");
        //         }
        //     }
        // }
       
        // return a;
        int left=0;
        int right=0;
        while(right<a.length){
            if(a[right]+a[left]==tar){
                System.out.println(left+" "+right);
                left++;
            }
            right++;
        }
        return a;
    }
    public static void main(String[] args) {
        // twoSum ts=new twoSum();
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int sum=8;
        int[] res=twosum(a, sum);
        System.out.println(Arrays.toString(res));
    }
}