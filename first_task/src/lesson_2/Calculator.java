package lesson_2;

import java.util.Scanner;

public class Calculator

{
    public static void main(String[] args) {
    System.out.println(sum(10,15));
    System.out.println(sum(10.5f,15.2f));
    System.out.println(sum(102.63,150.61));

    System.out.println(mult(10,15));
    System.out.println(mult(10.5f,15.2f));
    System.out.println(mult(102.63,150.61));

    System.out.println(division(10,15));
    System.out.println(division(10.5f,15.2f));
    System.out.println(division(102.63,150.61));

    System.out.println(subtract(10,15));
    System.out.println(subtract(10.5f,15.2f));
    System.out.println(subtract(102.63,150.61));

    }

    //сложение
    public static int sum(int x, int y)
    {
        return x + y;
    }
    public static float sum(float x, float y)
    {
        return x + y;
    }
    public static double sum(double x, double y)
    {
        return x + y;
    }

    //Умножение
    public static int mult(int x, int y)
    {
        return x * y;
    }
    public static float mult(float x, float y)
    {
        return x * y;
    }
    public static double mult (double x, double y)
    {
        return x * y;
    }

    //отрицание
    public static int subtract(int x, int y)
    {
        return x - y;
    }
    public static float subtract(float x, float y)
    {
        return x - y;
    }
    public static double subtract(double x, double y)
    {
        return x - y;
    }

    //деление
    public static int division(int x, int y)
    {
        return x / y;
    }
    public static float division(float x, float y)
    {
        return x / y;
    }
    public static double division(double x, double y)
    {
        return x / y;
    }
}
