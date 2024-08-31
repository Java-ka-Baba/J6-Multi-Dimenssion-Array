import java.util.Arrays;

public class DemoMultiArray {
    public static void main(String[] args) {
        int[][] array2D = new int[3][5];

        // access
        System.out.println(array2D[0][0]);
        // initialize by initializer
        int[][] brr2D = {
                {10,20,30,40},
                {40,30,20,10},
                {100,200,300,400}

        };
        System.out.println("brr2D.length = " + brr2D.length);
        System.out.println("brr2D[2].length = " + brr2D[2].length);

        print2DArray(brr2D);
        System.out.println("array2D printing");
        print2DArray(array2D);

    }

    private static void print2DArray(int[][] brr2D) {
        for (int rows = 0; rows < brr2D.length; rows++) {
            for (int cols = 0; cols < brr2D[rows].length; cols++) {
                System.out.print(brr2D[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
