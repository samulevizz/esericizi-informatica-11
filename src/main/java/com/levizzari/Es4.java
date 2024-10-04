package com.levizzari;
import java.util.Scanner;

public class Es4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi primo numero: ");
        int x = in.nextInt();
        System.out.print("Dimmi secondo numero: ");
        int y = in.nextInt();
        
        if (x == 0 || y == 0)
        {
            System.out.print("Non puoi divider per zero \n");
        }
        if (x == y)
        {
            System.out.print("I due numeri sono uguali \n");
        }
        else if(x % y == 0)
        {
            System.out.print("Il primo e' multiplo del secondo \n");
        }
        else
        {
            System.out.print("Non sono multipli \n"); 
        }
    }
}