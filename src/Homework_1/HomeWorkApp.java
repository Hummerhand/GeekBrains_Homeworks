package Homework_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, 8);
        printColor(50);
        compareNumbers(10, 50);
        
    }

    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor(int value) {
        if (value >=0 ) {
            System.out.println("Красный");
        } else if (0 < value && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}
