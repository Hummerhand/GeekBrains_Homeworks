package Homework_8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {

    final static int WINDOW_POSITION_X = GameWindow.WINDOW_POSITION_X + 50;
    final static int WINDOW_POSITION_Y = GameWindow.WINDOW_POSITION_Y + 50;
    final static int WINDOW_WIDTH = 400;
    final static int WINDOW_HEIGHT = 300;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private GameWindow gameWindow;
    private JButton btnNewGame;
    private JSlider slFieldSize;
    private JSlider slWinningLength;

    public SettingWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        // Устанавливает окно по координатам указанным ниже - константы
        setBounds(WINDOW_POSITION_X, WINDOW_POSITION_Y, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Устанавливает заголовок
        setTitle("TicTacToe");

        setLayout(new GridLayout(5, 1));

        add(new Label("Field size"));

        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintLabels(true);
        slFieldSize.setPaintTicks(true);
        add(slFieldSize);

        add(new Label("Winning length"));

        slWinningLength = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        slWinningLength.setMajorTickSpacing(1);
        slWinningLength.setPaintLabels(true);
        slWinningLength.setPaintTicks(true);
        add(slWinningLength);

        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slWinningLength.setMaximum(slFieldSize.getValue());
            }
        });

        btnNewGame = new JButton("Start New Game");
        add(btnNewGame);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = slFieldSize.getValue();
                int winningLength = slWinningLength.getValue();

                Logic.SIZE = size;
                Logic.DOTS_TO_WIN = winningLength;
                Logic.initMap();
                Logic.gameFinished = false;

                gameWindow.startNewGame(size, winningLength);
                setVisible(false);
            }
        });

        setVisible(false);
    }
}
