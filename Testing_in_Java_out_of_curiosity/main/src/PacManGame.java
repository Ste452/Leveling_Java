package Testing_in_Java_out_of_curiosity.main.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacManGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel pacman;
    private JLabel ghost;

    private int pacmanX, pacmanY;
    private int ghostX, ghostY;

    public PacManGame() {
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Pac-Man Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        pacman = new JLabel(new ImageIcon("pacman.png"));
        pacmanX = 50;
        pacmanY = 50;
        pacman.setBounds(pacmanX, pacmanY, 30, 30);

        ghost = new JLabel(new ImageIcon("ghost.png"));
        ghostX = 200;
        ghostY = 200;
        ghost.setBounds(ghostX, ghostY, 30, 30);

        setLayout(new FlowLayout());
        add(pacman);
        add(ghost);

        addKeyListener(new PacManKeyListener());

        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveGhost();
                checkCollisions();
            }
        });
        timer.start();

        setFocusable(true);
        setVisible(true);
    }

    private void moveGhost() {
        // Lógica simples: o fantasma se move aleatoriamente
        int direction = (int) (Math.random() * 4); // 0: cima, 1: baixo, 2: esquerda, 3: direita

        switch (direction) {
            case 0:
                ghostY -= 30;
                break;
            case 1:
                ghostY += 30;
                break;
            case 2:
                ghostX -= 30;
                break;
            case 3:
                ghostX += 30;
                break;
        }

        ghost.setBounds(ghostX, ghostY, 30, 30);
    }

    private void checkCollisions() {
        Rectangle pacmanBounds = pacman.getBounds();
        Rectangle ghostBounds = ghost.getBounds();

        if (pacmanBounds.intersects(ghostBounds)) {
            JOptionPane.showMessageDialog(this, "Game Over! You got caught by the ghost.");
            System.exit(0);
        }
    }

    private class PacManKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            switch (key) {
                case KeyEvent.VK_UP:
                    pacmanY -= 30;
                    break;
                case KeyEvent.VK_DOWN:
                    pacmanY += 30;
                    break;
                case KeyEvent.VK_LEFT:
                    pacmanX -= 30;
                    break;
                case KeyEvent.VK_RIGHT:
                    pacmanX += 30;
                    break;
            }

            pacman.setBounds(pacmanX, pacmanY, 30, 30);
            checkCollisions();
        }

        public void keyTyped(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PacManGame());
    }
}
