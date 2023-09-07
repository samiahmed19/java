package inheritance;

public class deadlock extends Thread{
    public static void main(String[] args) {
    Object train=new Object();
    Object comp= new Object();
    booking ob=new booking(train, comp);
    cancelticket ob1=new cancelticket(train, comp);
    Thread t1= new Thread(ob);
    Thread t2=new Thread(ob1);
    t1.start();
    t2.start();
    }

}
