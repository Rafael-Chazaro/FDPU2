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
public class Ejercicio5 {
    public static void main(String[] args) {
        // Escribe "ingrese el primer numero"
        System.out.println("ingrese el primer numero:");
        // Leer p1
        Scanner Leer = new Scanner (System.in);
        double p1 = Leer.nextDouble();
        // Escribe "ingrese el segundo numero"
        System.out.println("ingrese el primer numero:");
        //Leer p2
        double p2 = Leer.nextDouble();
        // mul <- p1 * p2 
        double mul = p1 * p2;
        //Escribir mul    
        System.out.println(mul);
    }
}
