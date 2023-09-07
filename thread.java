// package javacodes;

public class thread extends Thread{
    // public static void main(String[] args) {
    //     Thread t=new Thread().currentThread();
    //     System.out.println(t);
    //     System.out.println(t.getName());
    //     System.out.println(t.getPriority());

    // }
    int count=0;
    public void run(){
        for(int i=0;i<1000;i++){
            count++;
        }
        System.out.println("complete thread "+Thread.currentThread().getName());
        System.out.println("its priority: "+Thread.currentThread().getPriority());
    }
}
