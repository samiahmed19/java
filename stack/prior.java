// package javacodes;

public class prior{
    public static void main(String[] args) {
        thread obj=new thread();
        Thread t1=new Thread(obj,"one");
        Thread t2=new Thread(obj,"two");
        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
    }
}
