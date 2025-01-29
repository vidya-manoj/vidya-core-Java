package Com.JavaLearning_day1.operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int count = 10;

        count++;

        while (count < 50) {
            count += 10;
         //   System.out.println(count);

            count --;
           // System.out.println(count);

        }
        //System.out.println(count);

        int counter = 1;

        System.out.println("Pre-increment (++counter)::"+ ++counter);
        System.out.println("Pre-decrement (--counter)::"+ --counter);
        System.out.println("Post-increment (counter++)::"+ counter++);
        System.out.println("Post-decrement (counter--)::"+ counter--);
    }
}
