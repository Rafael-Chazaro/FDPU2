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
public class Ejercicio4 {
     public static void main(String[] args) {
        // Escirbir "Ingrese el primer numero"
        System.out.println("Ingrese el primer numero:");
        // Leer n1
        Scanner Leer = new Scanner (System.in);
        double n1 = Leer.nextDouble();
         // Escirbir "Ingrese el primer numero"
        System.out.println("Ingrese el segundo numero:");
        // Leer n2
        double n2 = Leer.nextDouble();
        // Resta <- n1 - n2
        double resta = n1 - n2;
        // Escribir rest - Resultado
         System.out.println(resta);
        
     }
}
