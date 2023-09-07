package inheritance;
public class inheritance {
    public static void main(String[] args) {
        vehical v=new vehical();
        v.color="Black";
        v.speed=300;
        car c=new car();
        c.color="Red";
        c.speed=250;
        System.out.println(v.color+" "+v.speed);
        System.out.println(c.color+" "+c.speed);

    }
}