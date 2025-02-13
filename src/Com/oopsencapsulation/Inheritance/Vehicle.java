package Com.oopsencapsulation.Inheritance;


// Parent class (Level 1)
public class Vehicle {

    void drive() {
        System.out.println("Vehicle is moving");

    }
}
 // Intermediate class (Level 2)

class Car extends Vehicle {

    void music() {
        System.out.println("Music is playing in car");
    }
}

// Child class (Level 3)
class ElectricCar extends Car {

    void charging() {
        System.out.println("Electric Car is Charging");
    }

}

