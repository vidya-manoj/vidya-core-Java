package Com.oopsencapsulation.constructors;

class Student {

    private String name;
    private int age;

    // Zero Argument Constructor - Provided by Programmer

    public Student() {

    }


    public  void display() {
        System.out.println("Name:: "+ name + " , Age:: "+ age);
    }

}

public class ZeroArgumentConstructors {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
