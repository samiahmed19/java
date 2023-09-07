public class binarySearch {
    public static int search(int []nums, int target) {
        //Your code goes here
        int start =0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
                // break;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            // return nums[start];
        }
        return -1;
    }
    public static void main(String[] args) {
    int a[]={6,5,13,32,40,45,65};
    int starget=40;
    search(a, starget);
    // for(int i=0;i<a.length;i++){
    //     System.out.print(a[i]+" ");
    // }
}
}
