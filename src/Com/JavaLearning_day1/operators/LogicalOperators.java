package Com.JavaLearning_day1.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // &&, ||, !

        int a = 10, b = 50;

        System.out.println("Logical And::" + (a > 10 && b > 10));
        System.out.println("Logical Or::" + (a > 10 || b > 10));
        System.out.println("Logical Not::" + ! (b > a));

        boolean istrue = true;
        boolean isfalse = false;


        boolean LogicalAnd = istrue && isfalse;  //logical AND (false)
        boolean LogicalOr = istrue || isfalse;   //logical OR (true)
        boolean LogicalNot = ! isfalse;          //logical NOT (true)

        System.out.println("Logical AND:: "+ LogicalAnd);
        System.out.println("Logical OR:: "+ LogicalOr);
        System.out.println("Logical NOT:: "+ LogicalNot);

    }
}
