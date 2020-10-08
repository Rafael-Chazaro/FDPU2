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
public class Ejercicio2 {
     public static void main(String[] args) {
         // Escirbir "Ingrese su nombre
        System.out.println("Ingrese su nombre:");
        
        // Leer nombre
        Scanner Leer = new Scanner(System.in);
        var nombre = Leer.nextLine();
        
        // mensaje <- "Bienvenido " + nombre
        String mensaje = "Bienvenido " + nombre;
        
        // EScribir mensaje
        System.out.println(mensaje); 
     }
}
