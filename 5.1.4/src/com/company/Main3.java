package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double q, w, e, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть три дробові числа");
        System.out.print("Введіть 1 дробове число: ");
        if (sc.hasNextDouble()) {
            q = sc.nextDouble();
            System.out.print("Введіть 2 дробове число: ");
            if (sc.hasNextDouble()) {
                w = sc.nextDouble();
                System.out.print("Введіть 3 дробове число: ");
                if (sc.hasNextDouble()) {
                    e = sc.nextDouble();
                    if (q >= w && q >= e) {
                        r = q;
                    } else if (w >= q && w >= e) {
                        r = w;
                    } else {
                        r = e;
                    }
                    System.out.println(r);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }
    }
}