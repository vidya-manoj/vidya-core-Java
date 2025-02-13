package Com.oopsencapsulation.Inheritance;

public class Shape {

    public void draw() {
        System.out.println("Shape is draw");
    }
}

class square extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a Square Shape");

    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

