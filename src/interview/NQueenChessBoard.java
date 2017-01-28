package interview;

public class NQueenChessBoard {

    public static final String Q = "Q";

    public static void main(String[] args) {
        String[][] board = createChessBoard(8);
        placeNQueens(board, 0);
        printChessBoard(board);
    }

    public static void printChessBoard(String[][] board) {
        int length = board[0].length;

        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] createChessBoard(int n) {
        String[][] chessBoard = new String[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                chessBoard[i][j] = "-";
            }
        }
        return chessBoard;
    }

    public static boolean placeNQueens(String[][] chessBoard, int column) {
        int length = chessBoard[0].length;

        //Base case
        if (column >= length) {
            return true;
        }

        for (int r = 0; r < length; ++r) {

            if (isValid(chessBoard, r, column)) {
                chessBoard[r][column] = Q;
                if (placeNQueens(chessBoard, column + 1)) {
                    return true;
                } else {
                    chessBoard[r][column] = "-";
                }
            }
        }

        return false;
    }

    public static boolean isValid(String[][] chessBoard, int row, int column) {
        int length = chessBoard[0].length;
        int i, j;
        if (Q.equals(chessBoard[row][column])) {
            return false;
        }
        for (i = 0; i < column; ++i) {
            if (Q.equals(chessBoard[row][i])) {
                return false;
            }
        }

        for (i = row, j = column; i >= 0 && j >= 0; --i, --j) {
            if (Q.equals(chessBoard[i][j])) {
                return false;
            }
        }

        for (i = row, j = column; i < length && j >= 0; ++i, --j) {
            if (Q.equals(chessBoard[i][j])) {
                return false;
            }
        }
        return true;
    }
}
