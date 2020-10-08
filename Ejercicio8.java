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
public class Ejercicio8 {
    public static void main(String[] args) {
        
        // "Ingresa el primer numero:"
        System.out.println("ingresa el primer numero");
        
        // Leer num
        Scanner Leer = new Scanner(System.in);
        Double num = Leer.nextDouble();
        
        //cubo <- num * num * num
        double cubo = Math.pow(num, 3);
        // Escirbir cubo
        System.out.println(cubo);
                
                
    }
}
