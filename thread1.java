// package javacodes;

public class thread1 {
    public static void main(String[] args) {
        trainticket tc=new trainticket(1);
        Thread t1= new Thread(tc);
        Thread t2=new Thread(tc);

        t1.setName("First person");
        t2.setName("Second person");
        t1.start();
        t2.start();
    }
}
