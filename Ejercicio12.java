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
public class Ejercicio12 {
    public static void main(String[] args) {
        
        // Escirbir "ingresa el radio del circulo"
        System.out.println("ingresa el radio del circulo");
        
        // Leer Radio 
        Scanner Leer = new Scanner(System.in);
        double Radio = Leer.nextDouble();
        
        // Area <- 3.1416 * (Radios * Radio)
        double Area = Math.PI * (Math.pow(Radio, 2));
        
        // Escirbir Area 
        System.out.println(Area);
        
    }
}
