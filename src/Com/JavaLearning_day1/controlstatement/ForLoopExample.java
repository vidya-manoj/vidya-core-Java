package Com.JavaLearning_day1.controlstatement;

public class ForLoopExample {

    //syntax
        /* for (intialization_of_value: condition: update_the_value) {

        } */

    public static void main(String[] args) {

      /*  System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");*/
       // example1();

       // example2();
        //example3();
        //example4();

        //multiplevariableonForLoop();
        forLoopwithoutInitializationAndUpdate();

    }

    private static void forLoopwithoutInitializationAndUpdate() {

        int i = 10;
        for (;i > 0;) {
            System.out.println("i:: "+ i);
            i++;
        }
        System.out.println("Final i value:: "+ i);

    }

    private static void multiplevariableonForLoop()  {

        for (int i = 10, j = 0; i >= 0 && j <= 10; i--, j++) {
            System.out.println("i:: "+ i + ", j:: "+ j);
        }


    }



    private static void infiniteLoop() {
        for (;true;) {
            System.out.println("Executing for loop");
        }
    }


    private static void greaterThanOrEqualTo() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("value of i: "+ i);

        }
    }
    private static void example2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: "+ i);

        }
    }



   private static void example1() {

       for (int counter = 0; counter < 500; counter++)  {

           System.out.println("Hello");
       }

    }
}
