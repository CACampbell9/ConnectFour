package com.company;

public class ConnectFourGrid {

    public static void gridDisplay(char[][] grid) {
        System.out.println(" 0 1 2 3 4 5 6 7");
        System.out.println("---------------");
        for (char[] chars : grid) {
            System.out.print("|");
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(chars[col]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("---------------");
        }
        System.out.println(" 0 1 2 3 4 5 6 7");
        System.out.println();
    }
}
