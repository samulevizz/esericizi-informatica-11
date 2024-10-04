package com.levizzari;
import java.util.Scanner;

public class Es1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi il primo numero: ");
        int x = in.nextInt();
        System.out.print("Dimmi il secondo numero: ");
        int y = in.nextInt();
        
        if(x>y)
            System.out.print("Il primo numero e' maggiore del secondo \n");
        else if (x==y)
            System.out.print("I due numeri sono uguali \n");
        else
            System.out.print("Il primo numero e' minore del secondo \n");
        in.close();
    }
}
