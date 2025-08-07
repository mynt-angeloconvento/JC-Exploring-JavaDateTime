package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeLab {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 8, 21);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));
    }
}