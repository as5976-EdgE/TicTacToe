import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random random = new Random();
        boolean validMoveFound = false;

        
        while (!validMoveFound) {
        
            int randomSlot = random.nextInt(9) + 1; 

            
            int row = getRowFromSlot(randomSlot);
            int col = getColFromSlot(randomSlot);

            if (isValidMove(row, col)) {

                placeMove(row, col, computerSymbol);
                System.out.println("Computer placed '" + computerSymbol + "' at slot " + randomSlot);
                validMoveFound = true; 
            }
        }
    }

    static int getRowFromSlot(int slot) { return (slot - 1) / 3; }
    static int getColFromSlot(int slot) { return (slot - 1) % 3; }
    static boolean isValidMove(int row, int col) { return board[row][col] == '-'; }
    static void placeMove(int row, int col, char symbol) { board[row][col] = symbol; }
}