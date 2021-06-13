package com.company;

import java.util.Scanner;

import static com.company.ToRoman.integerToRomanNumeral;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение из двух чисел: ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt())

        {
            int a = sc.nextInt();

            String operator = sc.next();

            int b = sc.nextInt();

            if ("+".equals(operator)) {
                a += b;
            } else  {
                a -= b;
            }
            System.out.println("Результат  = " +  a);

        }
        else {
            String s = sc.next();
            int a = FromRoman.fromRoman(s);

            String operator = sc.next();

            String b2 = sc.next();
            int b = FromRoman.fromRoman(b2);

            if (operator.equals("+")) {
                a += b;
            } else {
                a -= b;
            }

            System.out.println(ToRoman.integerToRomanNumeral(a));
        }sc.close();


    }

}
