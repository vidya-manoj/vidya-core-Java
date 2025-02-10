package Com.JavaLearning_day1.controlstatement;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name for application");
        String name = scanner.nextLine();

      switchStatement(name);

        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        ifSwitchStatements(age);

      System.out.println("Main Method Ended");

      SwitchStatements object3 = new SwitchStatements();

    }

    private static void switchStatement(String name)  {
        System.out.println("Entering Switch Statement Method");

        switch (name) {

            case "Vidya" :
                System.out.println("Gorgeous");
                break;
            case "Manoj":
                System.out.println("Intelligent");
                break;
            case "Riaan":
                System.out.println("Smart");
                break;
            case "Ayaan":
                System.out.println("Cute");
                break;
            default:
                System.out.println("Beautiful");


        }
        System.out.println("Exiting Switch Statement Method");

    }

    private static void ifSwitchStatements(int age)  {

        switch (age) {
            case 18:
                System.out.println("Minor");
             break;
            case 21:
                System.out.println("Adult");
             break;
            default:
                System.out.println("Wrong Input");

        }
    }



}

