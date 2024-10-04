package com.levizzari;
import java.util.Scanner;

public class Es7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi l'anno: ");
        int anno = in.nextInt();
        if(anno%4 == 0 && anno%100 != 0 || anno%400 == 0)
            System.out.print("L'anno e' bisestile");
        else
            System.out.print("L'anno non e' bisestile"); 
        in.close();
    }
}