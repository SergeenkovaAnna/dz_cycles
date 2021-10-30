package ru.skypro;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Arrays;

public class Методы {
    public static void main(String[] args) {
        //Task1
        printIsLeapYear(2020);
        //Task2
        messageRecommendApplicationVersion(0,2021);
        //Task3
        findDeliveryDays(30);
        //Task4
        findDuplicates("aabccddefgghiijjkk");
        //Task5
        int[] numbers = {3, 2, 1, 6, 5};
        reverseArray(numbers);
        System.out.println("Перевернутый массив: " + Arrays.toString(numbers));

    }

    //Task1
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeapYear(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " невисокосный");
        }
    }

    //Task2
    public static void messageRecommendApplicationVersion(int clientOs, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        StringBuilder message = new StringBuilder();
        message.append("Установите ");
        if (deviceIsOld) {
            message.append("lite ");
        }
        message.append("версию для ");
        if (clientOs == 0) {
            message.append("IOS");
        } else {
            message.append("Android");
        }
        System.out.println(message.toString());
    }
    private static boolean isDeviceOld(int deviceYear){
        int currentYear = LocalDate.now().getYear();
        return deviceYear<currentYear;
    }

    //Task3
    public static int findDeliveryDays(int deliveryDisance){
        int result = 1;
        if (deliveryDisance > 20) {
            result++;
        }
        if (deliveryDisance > 60) {
            result++;
        }
        System.out.println("Количество дней доставки: " + result);
        return result;
    }

    //Task4
    public static void findDuplicates(String text) {
        char[] letters = text.toCharArray();
        char previousChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == previousChar) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            previousChar = letter;
        }
        System.out.println("Дубля не найдено");
    }

    //Task5
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

}
