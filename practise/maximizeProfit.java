/**
 * maximizeProfit
 */
public class maximizeProfit {

    public static void main(String[] args) {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        int size=arr.length;
        int profit=0;
        for(int i=1;i<size;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        System.out.println("the profit is "+profit);
    }
}