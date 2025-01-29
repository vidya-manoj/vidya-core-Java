package Com.JavaLearning_day1.operators;

public class ArithmaticOperators {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 19;
        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 % number2;

        sum += mul;  //sum = sum + mul;

        System.out.println(sub);
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);




    }
}
