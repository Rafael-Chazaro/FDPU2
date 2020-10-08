/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdpu2;

import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         // Escribir "Ingresar el primer numero"
        System.out.println("Ingresar el primer numero");
        Scanner Leer = new Scanner (System.in);
        // Leer a
        double a = Leer.nextDouble();
        // Escribir "Ingresar el segundo numero"
        System.out.println("Ingresar el segundo numero");
        //Leer b
        double b = Leer.nextDouble();
        // = <- a + b
        
        double c = a + b;
        // Escribir c
        System.out.println(c);
     }
}
