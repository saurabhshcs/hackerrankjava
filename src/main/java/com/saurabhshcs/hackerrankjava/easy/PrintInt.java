package com.saurabhshcs.hackerrankjava.easy;

import java.util.Scanner;

public class PrintInt
{
    public static void main(String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        try {
            final Integer a = scan.nextInt();
            final Integer b = scan.nextInt();
            final Integer c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } catch (final Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scan.close();
        }
    }
}
