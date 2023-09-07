// package javacodes;

public class trainticket implements Runnable{
    int available=1;
    int wanted;
    public trainticket(int i){
        wanted=i;
    }
    public void run(){
        synchronized(this){
            System.out.println(available);
            if(available>=wanted){
                String name=Thread.currentThread().getName();
                System.out.println(wanted+"berths reserved for : "+name);
                try{
                    Thread.sleep(1500);
                    available=available-wanted;
                }
                catch(InterruptedException ie){

                }
            }
            else{
                System.out.println("Sry no berths available");
            }
        }
    }
}