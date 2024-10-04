package com.levizzari;
import java.util.Scanner;

public class Es8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dammi la prima misura: ");
        int x = in.nextInt();
        System.out.print("Dammi la seconda misura: ");
        int y = in.nextInt();
        System.out.print("Dammi la terza misura: ");
        int z = in.nextInt();
        
        if(x+y > z && x+z > y && y+z > x)
            System.out.print("Possono essere delle lunghezze di lati di un triangolo");
        else
            System.out.print("Non possono essere delle lunghezze di lati di un triangolo");
        in.close();
    }
}