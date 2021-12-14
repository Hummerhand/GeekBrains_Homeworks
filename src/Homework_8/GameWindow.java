package Homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    final static int WINDOW_POSITION_X = 500;
    final static int WINDOW_POSITION_Y = 300;
    final static int WINDOW_WIDTH = 500;
    final static int WINDOW_HEIGHT = 600;

    private SettingWindow settingWindow;
    private BattleMap battleMap;

    public GameWindow() {
        // Устанавливает окно по координатам указанным ниже - константы
        setBounds(WINDOW_POSITION_X, WINDOW_POSITION_Y, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Закрывает окно при нажатии на кнопку "х"
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Устанавливает заголовок
        setTitle("TicTacToe");

        settingWindow = new SettingWindow(this);
        battleMap = new BattleMap(this);
        add(battleMap, BorderLayout.CENTER);


        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");
        panel.add(btnNewGame);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);
        btnNewGame.setBackground(Color.CYAN);
        btnExit.setBackground(Color.PINK);

        btnExit.addActionListener(e -> System.exit(0));

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        // Видимость окна
        setVisible(true);


    }

    void startNewGame(int size, int winningLength) {
        battleMap.startNewGame(size, winningLength);
    }

}
