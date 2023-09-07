
import java.util.*;

class Car {
    private String name;
    private double price;
    
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getprice() {
        return price;
    }

    public String getname() {
        return name;
    }
}

class bill {
    double discount;
    double totalCost;
    Car car;
    public bill(Car car) {
        this.car = car;
    }


    public void calculate(String ioption, String aoption, double discount) {
        int  rto = 113990;
        int  tcs = 11000;
        int insurance=0,accessories=0;
        
        if (ioption.equalsIgnoreCase("yes")) {
            insurance = 47300;
        }
        if (aoption.equalsIgnoreCase("yes")) {
            accessories = 15000;
        }
        if (insurance > 0 || accessories > 0) {
                discount = Math.min(discount, 30000);
            } else {
                discount = 0;
            }
        totalCost = car.getprice() + rto + insurance + tcs + accessories - discount;
        System.out.println("Total cost: " + totalCost);
    }
}

public class CarBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Car[] cars = {
            new Car("Polo Trendline", 870000),
            new Car("Polo Highline", 1009000),
            new Car("Virtus Trendline", 1105000),
            new Car("Virtus Highline", 1308000),
            new Car("Taigun Trendline", 1489000),
            new Car("Taigun Highline", 1542000),
        };
        
        System.out.println("Select car number:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].getname());
        }
        int carrank = sc.nextInt();
        
        System.out.println("Do you need Insurance? (yes/no)");
        String io = sc.next();
        
        System.out.println("Do you need Additional Accessories? (yes/no)");
        String ao = sc.next();
        
        System.out.println("Dealer discount (% or rupees):");
        double discount = sc.nextDouble();
        
        Car select=cars[carrank - 1];
        bill billingProcess = new bill(select);
        billingProcess.calculate(io, ao, discount);
        
    }
}
