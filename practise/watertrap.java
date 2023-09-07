public class watertrap {
    public static void main(String[] args) {
        int[] a={1,0,2,3};
        int start=0;
        int end=a.length;
        int k=2;
        int to=0;
        int left=0;
        // int
        while(start <=a[end-1]){
            end=3;
            int mid=(start+end)/2;
            if(a[mid]==0 && a[end]<=a.length){
                // if(a[start]==a[end] && end<=a.length){ to=a[start]+a[end]; end+=3;}
                System.out.println(end);
                // else if(a[start]>a[k] && end<=a.length) {to=a[start]- a[end]; end+=3;}
                // else {to=a[end]-a[start];end+=3;}
            }
        }
        System.out.println(to);
    }
}
