public class secondLargest {
    public static void main(String[] args) {
        int[] a={ 12, 35, 1, 10, 34, 1};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
            }
            if(a[i]>second && a[i]!=first){
                second=a[i];
            }
        }
        if(second==Integer.MIN_VALUE){System.out.println("neg nums");};
        System.out.println(second+" ");
    }
}
