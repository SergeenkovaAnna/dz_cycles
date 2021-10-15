package ru.skypro;

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
        for (int a = 1; a <= 31;  a = a + 7) {
            System.out.println("Сегодня пятница " + a + "-е. Время готовить еженедельный отчет!");
        }

        //Задача 3
        System.out.println();
        int n = 2021;
        int y = n-200;
        int def = n-1975;
        for (int x = n - def; x > y && x <= n; x = x - 79) {
            System.out.println(x);
        }
        for (int x = n - def + 79; x > y && x <n+100; x = x + 79) {
            System.out.println(x);
        }

        // Задание 4
        System.out.println();
        int i = 1;
        for (i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");

            } else
                System.out.println(i + ": ");
        }

    }
}

