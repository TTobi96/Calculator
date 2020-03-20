package org.FastTrackIT;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println();
        System.out.println("a=");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        System.out.println("b=");
        int b = x.nextInt();


        int c = a + b;
        int d = a - b;
        int f = a * b;
        double e = a / b;

        System.out.println("+ of the 2 numbers = " +c);
        System.out.println("- of the 2 numbers = " +d);
        System.out.println("* of the 2 numbers = " +f);
        System.out.println("/ of the 2 numbers = " +e);

    }

}
