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
public class Ejercicio13 {
    public static void main(String[] args) {
        
        // Escribir "Ingresa la calificacion 1:"
        System.out.println("Ingresa la calificacion 1:");
        
        // Leer c1
        Scanner Leer = new Scanner(System.in);
        double c1 = Leer.nextDouble();
        
        // Escribir "Ingresa la calificacion 2:"
        System.out.println("Ingresa la calificacion 2:");
        
        // Leer c2
        double c2 = Leer.nextDouble();
        
        // Escribir "Ingresa la calificacion 3:"
        System.out.println("Ingresa la calificacion 3:");
        
        // Leer c3
        double c3 = Leer.nextDouble();
        
        
        // Escribir "Ingresa la calificacion 4:"
        System.out.println("Ingresa la calificacion 4:");
        
        // Leer c4
        double c4 = Leer.nextDouble();
        
         // Escribir "Ingresa la calificacion 5:"
        System.out.println("Ingresa la calificacion 5:");
        
        // Leer c5
        double c5 = Leer.nextDouble();
        
        // Promedio <- (c1 + c2 + c3 + c4 + c5) / 5
        double Promedio = ( c1 + c2 + c3 + c4 + c5 ) / 5;
        
        
        //Escirbir Promedio
        System.out.println(Promedio);
        
        
      
        
    }
}
