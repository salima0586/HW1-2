package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner in = new Scanner(System.in);
        System.out.println("name: Salima");
        String name = in.nextLine();
        System.out.println("name1: Привет");
        String privet = in.nextLine();
        System.out.println("Name: Salima Privet: Привет");
        in.close();

    }
}
