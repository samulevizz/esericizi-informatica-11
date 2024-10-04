package com.levizzari;
import java.util.Scanner;

public class Es6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi il primo numero: ");
        int primo_num = in.nextInt();
        System.out.print("Dimmi il secondo numero: ");
        int secondo_num = in.nextInt();
        System.out.print("Dimmi il terzo numero: ");
        int terzo_num = in.nextInt();
        
        if (secondo_num-primo_num==terzo_num-secondo_num)
            System.out.print("I numeri sono in progressione \n");
        else
            System.out.print("I numeri non sono in progressione \n");
    }
}
