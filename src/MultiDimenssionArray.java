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
        boolean flag = false;
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
            //check winner
            if(i >= 5 && i <= 9){
                // first row
                if(ticTacToe[0][0] == 'O' && ticTacToe[0][1] == 'O' && ticTacToe[0][2] == 'O'
                    || ticTacToe[0][0] == 'X' && ticTacToe[0][1] == 'X' && ticTacToe[0][2] == 'X'
                ){
                    if(ticTacToe[0][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }else if(ticTacToe[1][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][2] == 'O'
                        || ticTacToe[1][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][2] == 'X'
                ){
                    if(ticTacToe[1][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }
                else if(ticTacToe[2][0] == 'O' && ticTacToe[2][1] == 'O' && ticTacToe[2][2] == 'O'
                        || ticTacToe[2][0] == 'X' && ticTacToe[2][1] == 'X' && ticTacToe[2][2] == 'X'
                ){
                    if(ticTacToe[2][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                } else if (ticTacToe[0][0] == 'O' && ticTacToe[1][0] == 'O' && ticTacToe[2][0] == 'O'
                        || ticTacToe[0][0] == 'X' && ticTacToe[1][0] == 'X' && ticTacToe[2][0] == 'X'
                ) {
                    if(ticTacToe[0][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                } else if (ticTacToe[0][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][1] == 'O'
                        || ticTacToe[0][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][1] == 'X'
                ) {
                    if(ticTacToe[0][1] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }
                else if (ticTacToe[0][2] == 'O' && ticTacToe[1][2] == 'O' && ticTacToe[2][2] == 'O'
                        || ticTacToe[0][2] == 'X' && ticTacToe[1][2] == 'X' && ticTacToe[2][2] == 'X'
                ) {
                    if(ticTacToe[0][2] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }else if (ticTacToe[0][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][2] == 'O'
                        || ticTacToe[0][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][2] == 'X'
                ) {
                    if(ticTacToe[0][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }else if (ticTacToe[0][2] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][0] == 'O'
                        || ticTacToe[0][2] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][0] == 'X'
                ) {
                    if(ticTacToe[0][0] == 'O'){
                        System.out.println("Player 1 is winner");
                    }else{
                        System.out.println("Player 2 is winner");
                    }
                    flag = true;
                    break;
                }
            }

        }
        if(!flag){
            System.out.println("Play Again");
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
