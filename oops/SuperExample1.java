class Vehicle {
    String brand;
    int Speed;

    public Vehicle(String brand, int Speed) {
        this.brand = brand;
        this.Speed = Speed;
        System.out.println("Vehicle Constructor!");
    }

}

class Car extends Vehicle {
    int numOfDoors;

    public Car(String brand, int Speed, int numOfDoors) {
        super(brand, Speed);`
        this.numOfDoors = numOfDoors;
        System.out.println("Car constructor!");

    }
}

public class SuperExample1 {
    public static void main(String[] args) {
        Car obj = new Car("Toyota", 180, 4);
        System.out.println(obj.brand + obj.Speed + obj.numOfDoors);
    }

}
