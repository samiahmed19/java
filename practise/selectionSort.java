public class selectionSort {
    public static void main(String[] args) {
        int arr[]={5,6,2,3,4,7};
        int n=arr.length;
        // int temp=aar[0];
        for(int i=0;i<n;i++){
            int temp=i;
            for(int j=i;j<n;j++){
                if(arr[temp]>arr[j]){
                    temp=j;
                }
            }
            int sn=arr[temp];
            arr[temp]=arr[i];
            arr[i]=sn;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
