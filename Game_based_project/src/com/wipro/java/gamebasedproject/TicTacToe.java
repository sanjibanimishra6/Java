package com.wipro.java.gamebasedproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TicTacToe {
    private static final String URL = "jdbc:mysql://localhost:3306/tictactoe_game?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "sanjibanimishra";
    
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == 0 ? "_" : board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) return false;
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true;
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) return true;
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public void storeGameData(String boardState, String winner) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to the database
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "INSERT INTO game_data (board_state, winner) VALUES (?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, boardState);
                    stmt.setString(2, winner);
                    stmt.executeUpdate();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error storing data: " + e.getMessage());
        }
    }

    public String getBoardState() {
        StringBuilder state = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                state.append(board[i][j] == 0 ? "_" : board[i][j]);
            }
        }
        return state.toString();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + "'s turn!");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.checkWinner()) {
                    game.printBoard();
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    game.storeGameData(game.getBoardState(), String.valueOf(game.currentPlayer));
                    break;
                }
                if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("It's a draw!");
                    game.storeGameData(game.getBoardState(), "D");
                    break;
                }
                game.switchPlayer();
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        scanner.close();
    }
}
