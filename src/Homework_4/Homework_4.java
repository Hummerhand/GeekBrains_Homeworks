package Homework_4;

import java.util.Random;
import java.util.Scanner;

public class Homework_4 {
    /*
    1. Создание игрового поля. Игровое поле можно представить в виде символьного двумерного массива размером 3х3.
    В каждой ячейке массива могут находиться символы 'X’, ‘O’, ‘•’, которые означают фишки игроков и пустое поле.
    Для указания размера поля и количества фишек для победы добавим две константы SIZE и DOTS_TO_WIN.
     */
    public static char[][] map;
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;

    /*
    2. Ячейки поля. Чтобы не забыть, какой символ за что отвечает,
    их можно записать в именные константы.
     */
    public static final char DOT_EMPTY = '_';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    //================================================================================================================//

    public static void main(String[] args) {

        /*
        5. Тест программы. Можно запускать первый тест программы.
         */
        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    //================================================================================================================//

    /*
    3. Инициализация поля. При запуске программы необходимо инициализировать поле
    и заполнить все его ячейки символом, обозначающим пустое поле.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /*
    4. Вывод поля в консоль. Проинициализированное поле готово.
    Теперь необходимо вывести его в консоль.
     */
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    6. Проверка ячеек. Метод isCellValid() проверяет возможность установки фишки в указанную ячейку.
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    /*
    7. Ход человека. Теперь можно сделать метод, отвечающий за ход человека-игрока.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /*
    8. Ход компьютера. Для реализации хода компьютера достаточно чуть изменить метод хода игрока,
    добавив туда генератор случайных чисел.
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt();
            y = random.nextInt();
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /*
    9. Проверка на то, заполнилась ли карта
     */
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    /*
    10. Проверка победы. Необходимо проверить все выигрышные комбинации.
    Если хотя бы одна будет найдена, вернуть true
     */
    public static boolean checkWin(char symbol) {
        if(map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if(map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) return true;
        return false;
    }

}
