package ru.skypro;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        //Задача 1
        float[] arr = generateRandomArray();
        float sum = 0f;
        for (float element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " RUR");

        //task2
        float maxCost = -1f;
        for (float current : arr) {
            if (current > maxCost) {
                maxCost = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxCost + " рублей");
        Arrays.sort(arr);
        float minCost = arr[0];
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей");

        //task3
        float meddleCost = sum / arr.length;
        System.out.println("Средняя сумма трат за день сотавила " + meddleCost + " рублей");

        //task4
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            result = result + reverseFullName[i];
        }
        System.out.print(result);

    }

    public static float[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        float[] arr = new float[30];
        for (float i = 0; i < arr.length; i++) {
            arr[(int) i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}
