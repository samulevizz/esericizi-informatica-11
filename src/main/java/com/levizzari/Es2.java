package com.levizzari;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        System.out.print("Dimmi l'eta': ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        
        if (age >= 18) 
            System.out.print("Sei maggiorenne \n");
        else 
            System.out.print("Sei minorenne \n");
        in.close();
    }
}
