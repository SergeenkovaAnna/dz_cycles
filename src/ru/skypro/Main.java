package ru.skypro;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Задача 2
        System.out.println();
        for (int a = 1; a <= 31; a += 7) {
            System.out.println("Сегодня пятница " + a + "-е. Время готовить еженедельный отчет!");
        }

        //Задача 3
        {
            System.out.println();
            int currentYear = 2021;
            int start = currentYear - 200;
            int ending = currentYear + 100;
            for (int i = start; i < ending; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }

            // Задание 4
            System.out.println();
            int i = 1;
            for (i = 1; i <= 30; i++) {
                System.out.print(i + ":");
                if (i % 3 ==0) {
                    System.out.print("ping" + " ");
                }
                if (i % 5 == 0) {
                    System.out.print("pong" + " ");
                }
                System.out.println();
            }


        }
    }
}

