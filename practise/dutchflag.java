// package javacodes;

// ducth national flag problem without  two pointers ;

public class dutchflag {
    public static void sort012(int a[]){
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<a.length;i++){
            switch(a[i]){
                case 0:
                c0++;
                break;
                case 1:
                c1++;
                break;
                case 2:
                c2++;
                break;
            }
        }
        int i=0;
        while(c0>0){
            a[i++]=0;
            c0--;
        }
        while(c1>0){
            a[i++]=1;
            c1--;
        }
        while(c2>0){
            a[i++]=2;
            c2--;
        }
    }
        
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2,1,0,1,2,0,1,0,1};
        sort012(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
