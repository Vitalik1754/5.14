package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        String w, e;
        Scanner q = new Scanner(System.in);
        System.out.println("Введіть 1 рядок: ");
        w = q.nextLine();
        System.out.println("Введіть 2 рядок: ");
        e = q.nextLine();
        System.out.println();
        if (w.length() == e.length()){
            System.out.println(" 1 і 2 рядки рівні ");
        }else if (w.length() > e.length()) {
            System.out.println("Найбільший рядок 1 : " + w);
        }
        else {
            System.out.println("Найбільший рядок 2 : " + e);
        }
    }
}
