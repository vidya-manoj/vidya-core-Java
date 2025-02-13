package Com.oopsencapsulation.Inheritance;

public class Products {
    private String name;
    private double price;
    private String brand;

    protected void display() {
        System.out.println(
                "Products{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        ", brand='" + brand + '\'' +
                        '}'


        );
    }
}

class Computer extends Products {
   @Override
    public void display() {
       System.out.println(
               "Computer{" +

                       '}'

       );

    }
}