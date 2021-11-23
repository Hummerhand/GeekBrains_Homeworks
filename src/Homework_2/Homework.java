package Homework_2;

public class Homework {
    public static void main(String[] args) {

<<<<<<< HEAD
=======

>>>>>>> 754bbd5b499a00393a0f56c5e2d8123fbe8b875d
        //System.out.println(sumIn(5, 61));
        //positiveAndNegative(-1);
        //System.out.println(positiveAndNegativeReturn(1));
        //cyclicOutput(5, "Hello from Java");
        whatYear(2000);
    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    private static boolean sumIn(int a, int b) {
        int sum;
        sum = a + b;
        if (sum >= 10 && sum < 20) {
            return true;
        } else
          {
            return false;
          }
    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    private static void positiveAndNegative(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное!");
        }
        if (number < 0) {
            System.out.println("Число " + number + " отрицательное!");
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    private static boolean positiveAndNegativeReturn(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    private static void cyclicOutput (int step, String word) {
        for (int i = 0; i < step; i++) {
            System.out.println(word);
        }
    }

    /*
    5. * Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static boolean whatYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Введенный год является високосным! И в нем 366 дней!");
            return true;
        }
        else if (((year % 4 != 0) || (year % 100 == 0)) && (year % 400 != 0)){
            System.out.println("Введенный год Неявляется високосным! И в нем 365 дней!");
            return false;
         }
        return false;
    }

<<<<<<< HEAD
=======

>>>>>>> 754bbd5b499a00393a0f56c5e2d8123fbe8b875d
}
