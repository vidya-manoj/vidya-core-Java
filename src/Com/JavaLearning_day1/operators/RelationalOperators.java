package Com.JavaLearning_day1.operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isSmaller = a < b;
        boolean isGreaterOrpEqual = a >= b;
        boolean isLessOrEqual = a <= b;

        System.out.println("IsEqual:: " + isEqual);
        System.out.println("IsNotEqual: " + isNotEqual);
        System.out.println("IsGreater: " + isGreater);
        System.out.println("IsSmaller: " + isSmaller);
        System.out.println("IsGreaterOrEqual: " + isGreaterOrpEqual);
        System.out.println("IsLessOrEqual: " + isLessOrEqual);


        if (a == b) {
            System.out.println(a * b);
        } else if (a > b) {
            System.out.println("a is greater then b");
        }
        if (a != b) {
            System.out.println("a != b");
        }
        if (a <= b) ;
        {
            System.out.println("a <= b");
        }

    }
}

