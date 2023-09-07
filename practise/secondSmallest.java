public class secondSmallest {
    public static void main(String[] args) {
        int[] a={1,10,11,12,15,13,14,6,9,10};
        int n=a.length;
        int sn=Integer.MAX_VALUE;
        int sec_sn=Integer.MAX_VALUE;
        // System.out.println(sn+" ");
        for(int i=0;i<n;i++){
            if(a[i]<sn) {
                sn=a[i];
                // break;
            }
        }
        // System.out.println(sec_sn+" ");
        for(int i=0;i<n;i++){
            if(a[i]>sn && a[i]<sec_sn) sec_sn=a[i];
        }
        System.out.println(sec_sn);
    }
}
