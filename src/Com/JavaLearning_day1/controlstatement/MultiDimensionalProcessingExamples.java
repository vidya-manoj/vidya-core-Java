package Com.JavaLearning_day1.controlstatement;

public class MultiDimensionalProcessingExamples {

    public static void main(String[] args) {

       // LoopInsideLoop();
        //TwoDimensionalArrayProcessing();
       // StarPattern();
        //PyramidPattern();


    }

    private static void PyramidPattern() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 *  i - 1); a++){
                System.out.print("*");
            }
            System.out.println();




        }
    }

    private static void StarPattern() {

        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    private static void TwoDimensionalArrayProcessing() {

        int singledimensitional[] = {1, 2, 3, 4, 5, 7};
        int twodimentional[][] = {
                {1, 2, 3, 45},
                {4, 65, 46, 23, 34},
                {10, 20, 30}
        };
         int threedimentional[][][] = {
                 {
                         {1, 2, 3, 4},
                         {6, 7, 8, 9}
                 },
                 {
                         {252,1,98,67}

                 }

         };



        int [][] numbers = {
                {1,2,3,11},
                {4,5,6,},
                {7,8,9,24,67},
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++){
                System.out.print(numbers[row] [column]+ " ");
            }
            System.out.println();
        }
    }

    private static void LoopInsideLoop () {

        for (int i = 0; i <= 5; i++) {
            System.out.print("i: "+ i);
            for (int j = 0; j <= 5; j++) {
                System.out.println("j: "+ j);


            }
            System.out.println();
        }
    }
}



