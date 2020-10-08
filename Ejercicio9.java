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
public class Ejercicio9 {
    public static void main(String[] args) {
        
     // Escribir "lngrese el Lado del cuadrado:"
    System.out.println ("Ingrese el lado del cuadrado:");
    
    // Leer Lado
    Scanner Leer = new Scanner(System.in);
    double Lado = Leer.nextDouble();
    
    // Area <- Lado *  Lado
    double Area = Lado * Lado;
    
    // Escribir Area
    System.out.println (Area);

    }
}
