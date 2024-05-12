package ru.kulikovaelena;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        //Математические операторы
        int a = 15;
        int b=2;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a*b="+(a*b));

        //Логические операторы
        boolean boleanA = true;
        boolean boleanB = false;
        System.out.println("true && false = " + (boleanA && boleanB) );
        System.out.println("true || false = " + (boleanA || boleanB) );
        System.out.println("!true = " + (!boleanA) );

        byte byteA = -127;
        byte byteN = (byte)(byteA - 2); //переполнене byte
        System.out.println(byteN);

        int intA = (int) pow(2,32);
        System.out.println(intA);
        int intN = (int)(intA + 1); //переполнене int
        System.out.println(intN);

        // вычисления комбинаций типов данных (int и double)
        int intC = 14;
        double doubleC = 0.5;
        System.out.println("14/0.5 = " + (intC/doubleC));


    }
}