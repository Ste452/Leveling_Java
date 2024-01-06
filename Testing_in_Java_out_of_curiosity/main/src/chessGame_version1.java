package Testing_in_Java_out_of_curiosity.main.src;

import java.util.Scanner;

class chessGame_version1 {
    static int row = 8;
    static int col = 8;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            String[] board = new String[row];

            // Initialization of the chess board
            for (int i = 0; i < row; i++) {
                board[i] = new String(new char[col]).replace('\0', ' ');
            }

            // Loop until the user quits
            while (true) {
                System.out.println("\n\n");
                for (int i = 0; i < row; i++) {
                    System.out.println((i + 1) + " " + board[i]);
                }

                System.out.println("\nEnter your move (e.g., a2 to b3) or type 'quit' to end the game: ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                String[] moves = input.split(" to ");
                if (moves.length != 2) {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }

                int[] source = convertCoordinates(moves[0]);
                int[] destination = convertCoordinates(moves[1]);
                if (source == null || destination == null) {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }

                if (!movePiece(board, source, destination)) {
                    System.out.println("Invalid move. Please try again.");
                }
            }
        }
    }

    private static int[] convertCoordinates(String coord) {
        if (coord.length() != 2) {
            return null;
        }

        char column = coord.charAt(0);
        char row = coord.charAt(1);
        if (column < 'a' || column >= 'a' + col || row < '1' || row > '1' + row) {
            return null;
        }

        return new int[] { row - '1', column - 'a' };
    }

    private static boolean movePiece(String[] board, int[] source, int[] destination) {
        if (board[source[0]].charAt(source[1]) == ' ') {
            return false;
        }

        StringBuilder destRow = new StringBuilder(board[destination[0]]);
        destRow.setCharAt(destination[1], board[source[0]].charAt(source[1]));
        board[destination[0]] = destRow.toString();

        StringBuilder sourceRow = new StringBuilder(board[source[0]]);
        sourceRow.setCharAt(source[1], ' ');
        board[source[0]] = sourceRow.toString();

        return true;
    }
}
