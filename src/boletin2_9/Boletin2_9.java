/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca la cantidad de billetes de 100€");
        Scanner b100 = new Scanner(System.in);
        int b100e = b100.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 50€");
        Scanner b20 = new Scanner(System.in);
        int b20e = b20.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 20€");
        Scanner b10 = new Scanner(System.in);
        int b10e = b10.nextInt();
        System.out.println("Introduzca la cantidad de monedas de 1€");
        Scanner mon1 = new Scanner(System.in);
        int mon1e = mon1.nextInt();
        System.out.println("Has introducido "+(b100e*100+b20e*20+b10e*10+mon1e*1)+"€");
    }
    
}