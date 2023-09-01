package com.learn.java_programming.projects.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private final int SIZE = 3;
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[SIZE][SIZE];
        currentPlayer = 'X'; // Start with player X
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {
        // Check horizontal and vertical lines
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true;
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) return true;

        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current player: " + currentPlayer);
            System.out.print("Enter row (0-2) and column (0-2) separated by space: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || col < 0 || row >= SIZE || col >= SIZE || board[row][col] != '-') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isBoardFull()) {
                System.out.println("It's a tie!");
                break;
            }

            changePlayer();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }
}
