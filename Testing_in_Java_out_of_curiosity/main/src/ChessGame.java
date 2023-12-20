package Testing_in_Java_out_of_curiosity.main.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton[][] chessBoardSquares = new JButton[8][8];

    public ChessGame() {
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new GridLayout(8, 8));
        createChessBoard();
        initializeChessPieces();
        displayChessBoard();
        setVisible(true);
    }

    private void createChessBoard() {
        Color lightColor = new Color(255, 223, 186);
        Color darkColor = new Color(133, 94, 66);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoardSquares[i][j] = new JButton();
                chessBoardSquares[i][j].setOpaque(true);
                chessBoardSquares[i][j].setBorderPainted(false);

                if ((i + j) % 2 == 0) {
                    chessBoardSquares[i][j].setBackground(lightColor);
                } else {
                    chessBoardSquares[i][j].setBackground(darkColor);
                }

                final int row = i;
                final int col = j;
                chessBoardSquares[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        squareClicked(row, col);
                    }
                });

                add(chessBoardSquares[i][j]);
            }
        }
    }

    private void initializeChessPieces() {
        // Unicode symbols for chess pieces
        String[][] pieces = {
                {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
                {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
                {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoardSquares[i][j].setText(pieces[i][j]);
            }
        }
    }

    private void displayChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            	chessBoardSquares[i][j].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
            }
        }
    }

    private void squareClicked(int row, int col) {
        // Handle the click on the chessboard square (e.g., move the piece, check for checkmate, etc.).
        // This is where you can add the logic for the game.

        // For now, let's just print the clicked square.
        System.out.println("Square clicked: " + row + ", " + col);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessGame());
    }
}
