public class maxIndexDiff {
    public static int maxIndexdiff(int[] arr, int n){
        int[] rightMax=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        while(start<n && end<n){
            if(rightMax[end]>=arr[start]) {
                max=Math.max(max, end-start);
                end++;
            }
            else start++;
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n=arr.length;
        int ans=maxIndexdiff(arr,n);
        System.out.println(ans);
    }
}
