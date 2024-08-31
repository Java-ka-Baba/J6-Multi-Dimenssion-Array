import java.util.Scanner;

public class MultiDimenssionArray {
    public static void main(String[] args) {
        //create array to play tic-tac-toe
        char[][] ticTacToe = new char[3][3];
       // ticTacToe[1][1] = 'O';
        //ticTacToe[0][0] = 'X';
        Scanner scanner  = new Scanner(System.in);
        //print2DArray(ticTacToe);

        // game will run for 9 inputs
        // who will play first, O
        // second chance will be X
        //  game will be played for 9 turns, on odd turn you will print O
        // and on even turn you will print X
        // you will ask user to enter row and col, by displaying full tic-tac-toe

        for (int i = 1; i <= 9; i++) {
            System.out.println("------------------------------------------");
            print2DArray(ticTacToe);
            System.out.println("Select the row number");
            int row = scanner.nextInt();
            System.out.println("Select the col number");
            int col = scanner.nextInt();
            if(i % 2 == 0){
                ticTacToe[row][col] = 'X';
            }else {
                ticTacToe[row][col] = 'O';
            }
            System.out.println("------------------------------------------");

        }
        System.out.println("Final");
        print2DArray(ticTacToe);
    }
    private static void print2DArray(char[][] brr2D) {
        for (int rows = 0; rows < brr2D.length; rows++) {
            for (int cols = 0; cols < brr2D[rows].length; cols++) {
                if(brr2D[rows][cols] == 'O' || brr2D[rows][cols] == 'X'){
                    System.out.print(brr2D[rows][cols] + "  |  ");
                }else {
                    System.out.print(rows + "," + cols + "  |  ");
                }
            }
            System.out.println();
            System.out.println("______________________");
        }
    }
}
