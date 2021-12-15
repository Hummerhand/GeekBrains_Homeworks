package Homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    private int size;
    private int winningLength;

    private boolean isInit;

    private int cellHeight;
    private int cellWidth;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (!Logic.gameFinished) {
                    Logic.humanTurn(cellX, cellY);
                }
                if (!Logic.gameFinished) {
                    Logic.aiTurn(cellX, cellY);
                }
                if (Logic.checkWin(Logic.DOT_X)) {
                    JOptionPane.showMessageDialog(gameWindow, "Игрок победил!", "Игра завершена", JOptionPane.INFORMATION_MESSAGE);
                }
                if (Logic.checkWin(Logic.DOT_O)) {
                    JOptionPane.showMessageDialog(gameWindow, "AI победил!", "Игра завершена", JOptionPane.INFORMATION_MESSAGE);
                }
                if (Logic.isMapFull()) {
                    JOptionPane.showMessageDialog(gameWindow, "Ничья!", "Игра завершена", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    void startNewGame(int size, int winningLength) {
        this.size = size;
        this.winningLength = winningLength;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(!isInit) {
            return;
        }

        cellHeight = getHeight() / size;
        cellWidth = getWidth() / size;

        g.setColor(Color.DARK_GRAY);
        ((Graphics2D)g).setStroke(new BasicStroke(2f));

        for (int i = 0; i < size; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 0; i < size; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[j][i] == Logic.DOT_X) {
                    drawX(g, i, j);
                }
                else if (Logic.map[j][i] == Logic.DOT_O) {
                    drawO(g, i, j);
                }
            }
        }
        repaint();
    }

    private void drawX(Graphics g, int cellX, int cellY) {
        g.setColor(Color.BLUE);
        ((Graphics2D)g).setStroke(new BasicStroke(2f));

        g.drawLine(cellX *cellWidth, cellY * cellHeight,
                cellX * cellWidth + cellWidth, cellY * cellHeight + cellHeight);
        g.drawLine(cellX *cellWidth + cellWidth, cellY * cellHeight,
                cellX * cellWidth, cellY * cellHeight + cellHeight);
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        g.setColor(Color.RED);
        ((Graphics2D)g).setStroke(new BasicStroke(2f));

        g.drawOval(cellX *cellWidth, cellY * cellHeight, cellWidth, cellHeight);

    }
}
