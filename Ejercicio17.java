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
public class Ejercicio17 {
    public static void main(String[] args) {
        
        //Escribir "Ingrese el primer nuemero de kilometros a convertir"
        System.out.println("Ingrese el primer nuemero de kilometros a convertir");
        
        // Leer Valor
        Scanner Leer = new Scanner(System.in);
        double Km = Leer.nextDouble();
        
        // m <- km * 1000
        double m = Km * 1000;
        
        // Escribir m
        System.out.println(m);
        
    }
    
}
