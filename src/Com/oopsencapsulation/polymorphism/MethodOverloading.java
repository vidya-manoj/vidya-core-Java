package Com.oopsencapsulation.polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10,30);
        calculator.add(10, 30, 90);
        calculator.add(49.88, 77.89);

    }

}
