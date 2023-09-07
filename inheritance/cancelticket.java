package inheritance;
// package javacodes;

public class cancelticket  extends Thread{
    Object train,comp;
    public cancelticket(Object train, Object comp){
        this.train=train;
        this.comp=comp;
    }
    public void run(){
        synchronized(comp){
            System.out.println("cancel ticekt locked on compartment");
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException ie){

            }
            System.out.println("cancel ticket now waiting too long");

        }
        synchronized(train){
            System.out.println("Cancel ticket locked on train");
        }
    }
}
