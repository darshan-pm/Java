class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.start();
    }
}