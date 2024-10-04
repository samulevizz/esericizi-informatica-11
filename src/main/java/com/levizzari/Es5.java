package com.levizzari;
import java.util.Scanner;

public class Es5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimmi la temperatura: ");
        float tempC = in.nextFloat();
        float tempF = (9/5) * tempC + 32;
        float tempK = (float) (tempC + 273.15);
        
        if(tempC < -273.15)
            System.out.print("ERRORE: La temperatura, " + tempC + " non puo' essere minore di -273.15 gradi kelvin (Zero assoluto)");
        else
        {
            System.out.println("Temperatura in Celsius = " + tempC + " C");
            System.out.println("Temperatura in Fareneith = " + tempF + " F");
            System.out.println("Temperatura in Kelvin = " + tempK + " K");
        }
        in.close();
    }
}