// package javacodes;

public class defaultparameter {
    public defaultparameter(){
        System.out.println("Default constructor");
    }
    int t1;
    String name;
    // instance variable declaration
    public static void main(String[] args) {
        defaultparameter d= new defaultparameter();//it will create a obj for the existing class
        d.t1=100;
        d.name="sami";
        System.out.println(d.t1+" "+d.name);
    }
    
}


