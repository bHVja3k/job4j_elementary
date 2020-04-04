package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
            for (int r = 0; r < board.length - 1; r++) {
                if (board[i][r] == board[i + 1][r + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}