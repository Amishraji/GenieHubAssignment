// Method overriding : where child class modify behaviour of the parent class
// according to its own ways
//its also called run time polymorphism when we use upcasting
//in upcasting we reference variable of parent class refers to the object of child class
class Vehicle{
public void speed(){
    System.out.println("All vehicles speed are different");  
}
}

class Bike extends Vehicle{
    public void speed(){
        System.out.println("bike maximum speed is 220km/hr");
    }
}

class Car extends Vehicle{
    public void speed(){
        System.out.println("Car maximum speed is 200km/hr");
    }
}

class Truck extends Vehicle{
public void speed(){
        System.out.println("Truck maximum speed is 100km/hr");
    }}

public class MODemo {
    public static void main(String[] args) {
        Bike b=new Bike();
        Car c = new Car();
        Truck v= new Truck();
        b.speed();
        c.speed();
        v.speed();
    }
}
