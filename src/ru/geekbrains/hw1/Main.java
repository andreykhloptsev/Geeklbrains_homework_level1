package ru.geekbrains.hw1;

import java.util.Scanner;

public class Main {


    // Метод был пустой пока я не начал проверять в нем работоспособность других методов
    public static void main(String[] args) {
       leap_year();
        // check_hw();
    }


    //Переменные основных типов данных
    byte variable_byte = 100;
    int variable_int = 600000;
    short variable_short = 20000;
    long variable_long = 20000L;
    float variable_float = 200.0f;
    double variable_double = 10.023;
    char variable_char = 'C';
    boolean variable_bool = true;


    // Метод вычисляющий значение выражения
     public static double func_math(double a, double b, double c, double d) {
         if (d != 0.0) {
             return a * (b + (c / d));
         }
         else  System.out.println("try not zero d");
         return 1.0;
     }

    //Метод проверяющий сумму 2 чисел
    public static boolean func_sum_check(double a, double b) {
        return a + b >= 10 && a + b <= 20;
    }

    //Метод проверяющий знак числа
    public static void func_pos(double a) {
        if (a >=0)
        {
            System.out.println("Positive number!");
        }
        else System.out.println("Negative number");
    }
    // Метод возвращающий true если число отрицательное
    public static boolean func_neg_int(int a) {

         if(a < 0)
         {
             return true;
         } else {
             return false;
         }
    }

    //Метод выводящий в консоль "Привет, указанное_имя"


    public static void func_name(String a) {

        System.out.println("Привет, "+a);
    }

    //Метод определяющий является ли год високосным

    public static void leap_year() {
        System.out.println("Введите номер года: ");
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();
        if (year % 400 == 0) {
            System.out.println("Год високосный!");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный!");
        } else if (year % 4 == 0)
        {
            System.out.println("Год високосный!");
        } else
            {
                System.out.println("Год не високосный!");
            }
    }





    public static void check_hw ()
    {
        //Переменные для всех заданий
        double var_a=2.0, var_b=13.0, var_c=52.3, var_d=-100.2;
        int int_a=4;
        String str= "name";

        System.out.println("HW_1_3 : "+func_math(var_a,var_b,var_c,var_d));

        System.out.println("HW_1_4 : "+func_sum_check(var_a,var_b));

        func_pos(var_a);

        System.out.println("HW_1_6 : "+func_neg_int(int_a));

        func_name(str);


    }


}
