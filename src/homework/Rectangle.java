package homework;

import java.util.Scanner;

public class Rectangle {
    static double side1;
     static double side2;
    public static void main(String[] args)
    {
        System.out.println("введіть довжину сторони №1");
        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextDouble();
        System.out.println("введіть довжину сторони №2");
        side2 = scanner.nextDouble();
        System.out.println(" площa прямокутника = " + areaCalculator(side1, side2));
        System.out.println("периметр прямокутника = " + perimeterCalculator(side1, side2));
    }
    public static double areaCalculator (double side1, double side2){ //  площу прямокутника
        return side1 *side2;
    }
    public  static double perimeterCalculator (double side1, double side2){ //ериметр прямокутника
        return (2*side1) +(2*side2);
    }
}
