// package javacodes;

public class parameters_constructor {
    int t1;
    String name;
    public parameters_constructor(int t1, String name){
        this.t1=t1;
        this.name=name;
    }
    // int t1;
    // String name;
    public static void main(String[] args) {
        
        parameters_constructor pc= new parameters_constructor(100, "sami");
        System.out.println(pc.t1+": "+pc.name);
    }
}
