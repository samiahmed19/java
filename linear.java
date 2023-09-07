public class linear {
    public static void main(String[] args) {
        int[] a= {1,8,2,10,15,5};
        int search=8;
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                temp=-1;
                System.out.println("Found "+a[i]);
            }
        }
        if(temp!=-1) System.out.println("not found: "+search);
    }
}
