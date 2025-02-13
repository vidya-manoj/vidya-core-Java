package Com.oopsencapsulation.Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        
    Vehicle electricCar = new ElectricCar();
    electricCar.drive();

    if (electricCar instanceof ElectricCar) {
        ((ElectricCar) electricCar).music();
        ((ElectricCar) electricCar).charging();

    }




    }
    
}
