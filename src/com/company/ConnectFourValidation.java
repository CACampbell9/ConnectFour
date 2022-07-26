package com.company;

public class ConnectFourValidation {

    public static boolean validate(int column, char[][] grid) {
        //check if column exists
        if (column < 0 || column > grid[0].length) {
            return false;
            //add in validation to stop it bombing out
        }

        //check if column is full
        return grid[0][column] == ' ';
    }

    public static boolean isWinner(char player, char[][] grid) {
        //check for 4 in a row
        for (char[] chars : grid) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (chars[col] == player &&
                        chars[col + 1] == player &&
                        chars[col + 2] == player &&
                        chars[col + 3] == player) {
                    return true;
                }
            }
        }
        //check for 4 up and down
        for(int row = 0; row < grid.length - 3; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == player   &&
                        grid[row+1][col] == player &&
                        grid[row+2][col] == player &&
                        grid[row+3][col] == player) {
                    return true;
                }
            }
        }
        //check upward diagonal
        for(int row = 3; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player   &&
                        grid[row-1][col+1] == player &&
                        grid[row-2][col+2] == player &&
                        grid[row-3][col+3] == player) {
                    return true;
                }
            }
        }
        //check downward diagonal
        for(int row = 0; row < grid.length - 3; row++) {
            for(int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player   &&
                        grid[row+1][col+1] == player &&
                        grid[row+2][col+2] == player &&
                        grid[row+3][col+3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
}
