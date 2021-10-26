package ru.skypro;

import java.util.Locale;

public class Строки {
    public static void main(String[] arg) {
        //Task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + " ";
        System.out.println("ФИО сотрудника - " + fullName);

        //Task2
        String BigLetters = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + BigLetters);

        //Task3
        String propuskName = fullName.replace(" " , "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + propuskName);

        //Task4
        String nonUnikal = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника - " + nonUnikal);

    }


    }

