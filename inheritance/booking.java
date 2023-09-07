package inheritance;
public class booking extends Thread{
    Object train,comp;
    public booking(Object train,Object comp){
        this.train=train;
        this.comp=comp;
    }
    public void run(){
        synchronized(train){
            System.out.println("Book ticket locked on train");
            try{
                Thread.sleep(150);
            }
            catch(InterruptedException ie){

            }
            System.out.println("Book ticket now waiting to lock on compartment");
        }
        synchronized(comp){
            System.out.println("Booked ticket lock on compartment");
        }
    }

    
}
