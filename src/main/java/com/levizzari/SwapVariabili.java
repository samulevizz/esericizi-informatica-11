package com.levizzari;
import java.util.Scanner;

public class SwapVariabili 
{
public class SwapExample {
    public static void main(String[] args) {
        // Creazione dello scanner per input dell'utente
        Scanner input = new Scanner(System.in);

        // Chiede all'utente di inserire il valore di 'a'
        System.out.print("Inserisci il valore di a: ");
        int a = input.nextInt();

        // Chiede all'utente di inserire il valore di 'b'
        System.out.print("Inserisci il valore di b: ");
        int b = input.nextInt();

        // Stampa dei valori prima dello swap
        System.out.println("Prima dello swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Esegue lo swap usando la variabile 'c'
        int c = a;
        a = b;
        b = c;

        // Stampa dei valori dopo lo swap
        System.out.println("Dopo lo swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

}

