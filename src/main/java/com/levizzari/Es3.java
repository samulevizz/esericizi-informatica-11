package com.levizzari;
import java.util.Scanner;

public class Es3 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi quanti anni hai: ");
        int age = in.nextInt();
        
        if (age >= 21) 
            System.out.print("In Kuwait puoi prendere la patente e in tutti gli altri stati del mondo \n");
        else if (age >= 18) 
            System.out.print("In Italia e in altri stati nel mondo puoi prendere la patente \n");
        else if (age >= 17) 
            System.out.print("In Francia e in America puoi prendere la patente \n");
        else if (age >= 16) 
            System.out.print("In America puoi prendere la patente \n");
        else 
            System.out.print("Non puoi prendere la patente \n");   
        
        in.close();
    }
}
