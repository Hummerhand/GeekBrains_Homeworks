package Homework_3;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1, 0};
        returnArray(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        int[] array2 = new int[100];
        fillingTheArray(array2);
        for (int i = 1; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationNumbers(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println();

        int[][] array4 = {{5, 5, 5},
                          {3, 3, 3},
                          {9, 9, 9}};
        diagonale(array4);
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        int[] array5 = fillingInAnUndefinedArray(5, 5);
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }

        System.out.println();

        findMaxAndMinElements(array3);

        System.out.println();

        int[] array6 = {1,2,2,9,3,2};
        checkIfEqualOption(array6);
    }

    //================================================================================================================//

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static int[] returnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    /*
    2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static int[] fillingTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;
     */
    public static int[] multiplicationNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static int[][] diagonale(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] fillingInAnUndefinedArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /*
    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */
    public static int[] findMaxAndMinElements(int[] array) {
        int minElement = array[0], maxElement = array[0];
        int minElementIndex = 0, maxElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
               minElement = array[i];
               minElementIndex = i;
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }
        System.out.println("Минимальный элемент массива: " + minElement + ", Индекс минимального элемента: " + minElementIndex);
        System.out.print("Максимальны элемент массива: " + maxElement + ", Индекс максимального элемента: " + maxElementIndex);
        return array;
    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean checkIfEqualOption(int[] array){

        int sumTotal = 0;
        for (int i = 0; i < array.length; i++){
            sumTotal += array[i];
        }

        int sumRight;
        int sumLeft = 0;
        for (int i = 1; i < array.length - 1; i++){
            sumLeft += array[i - 1];
            sumRight = sumTotal - array[i] - sumLeft;
            if (sumRight == sumLeft){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
