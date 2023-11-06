package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        System.out.println("Результат с if/else: " + NumberConverter.convertNumber(input));
        System.out.println("Результат с тернарными операторами: " + NumberConverter.convertNumberTernary(input));
    }
}