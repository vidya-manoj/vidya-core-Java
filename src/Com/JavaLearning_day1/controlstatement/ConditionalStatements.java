package Com.JavaLearning_day1.controlstatement;

import java.lang.invoke.MethodHandles;

public class ConditionalStatements {

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        ifElseStatement();

        System.out.println("Main Method Ended");
    }

    private static void ifElseStatement() {

        System.out.println("entering ifElseStatement");
        int age = 21;
        String name = new String("Vidya");

        if (age >= 18 && name.equalsIgnoreCase("Vidya")) {
            System.out.println("Vidya, you are an adult");
        } else if (age >= 21) {
            System.out.println("You are an adult");

        }else if (!name.equalsIgnoreCase("vidya"))  {
            System.out.println("You are not Vidya");
        } else {
            System.out.println("you are Minor");

        }

        System.out.println("Exiting from ifElseStatement");

    }



}
