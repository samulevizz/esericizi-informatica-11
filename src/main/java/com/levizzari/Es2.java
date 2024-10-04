package com.levizzari;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        System.out.print("Dimmi l'eta': ");
        Scanner in = new Scanner(System.in);
        int eta = in.nextInt();
        
        if (eta >= 18) 
            System.out.print("Sei maggiorenne \n");
        else 
            System.out.print("Sei minorenne \n");
        in.close();
    }
}
