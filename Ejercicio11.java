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
public class Ejercicio11 {
    public static void main(String[] args) {
        // Escribir "ingrese la base del rectangulo"
        System.out.println("ingrese la base del rectangulo");
        
        // Leer Base 
        Scanner Leer = new Scanner (System.in);
        double Base = Leer.nextDouble();
        
        // Escribir "ingrese la altura del triangulo"
        System.out.println("ingrese la altura del triangulo");
        double Altura = Leer.nextDouble();
        
        //Area <- (Base * Altura) / 2 
        double Area = (Base * Altura) / 2;
        
        // Escribir Area
        System.out.println(Area);
    }
}
