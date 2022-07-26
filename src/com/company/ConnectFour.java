package com.company;

import java.util.Scanner;

import static com.company.ConnectFourGrid.gridDisplay;
import static com.company.ConnectFourValidation.isWinner;
import static com.company.ConnectFourValidation.validate;

public class ConnectFour {

    public static void main(String[] args) {
        System.out.println("Welcome to Connect Four!");
        Scanner in = new Scanner(System.in);

        char[][] grid = new char[7][7];

        //initialize array
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = ' ';
            }
        }

        int turn = 1;
        char player = 'A';
        boolean winner = false;

        //play a turn
        while (!winner && turn <= 42){
            boolean validPlay;
            int play;
            do {
                gridDisplay(grid);

                System.out.print("Player " + player + ", choose a column: ");
                play = in.nextInt();

                //validate play
                validPlay = validate(play,grid);

            } while (!validPlay);

            //drop the checker
            for (int row = grid.length-1; row >= 0; row--) {
                if(grid[row][play] == ' ') {
                    grid[row][play] = player;
                    break;
                }
            }

            //determine if there is a winner
            winner = isWinner(player,grid);

            //switch players
            if (player == 'A') {
                player = 'B';
            } else {
                player = 'A';
            }

            turn++;
        }
        gridDisplay(grid);

        if (winner) {
            if (player=='A') {
                System.out.println("Black won");
            } else {
                System.out.println("Red won");
            }
        } else {
            System.out.println("Tie game");
        }
    }
}






