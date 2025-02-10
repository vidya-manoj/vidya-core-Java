package Com.JavaLearning_day1.controlstatement;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        //SimpleBreakExample();
        SimpleContinueExample();


    }

    private static void SimpleContinueExample() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: "+ i);

        }
    }
    private static void SimpleBreakExample() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print("i: "+ i);
        }
    }
}
