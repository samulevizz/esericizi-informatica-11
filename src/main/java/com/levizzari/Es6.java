package com.levizzari;
import java.util.Scanner;

public class Es6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi il primo numero: ");
        int x = in.nextInt();
        System.out.print("Dimmi il secondo numero: ");
        int y = in.nextInt();
        System.out.print("Dimmi il terzo numero: ");
        int z = in.nextInt();
        
        if (y-x==z-y)
            System.out.print("I numeri sono in progressione \n");
        else
            System.out.print("I numeri non sono in progressione \n");
    }
}