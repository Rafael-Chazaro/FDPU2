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
public class Ejercicio7 {
    public static void main(String[] args) {
        
    // "ingresar el primer numero:"
    System.out.println("Ingresa un numero:");
        
    // Leer num
    Scanner Leer = new Scanner (System.in);
    double num = Leer.nextDouble();
        
    // Elevar <- num * mum  (2)
    double elevar = num * num;
                
    // Escirbir elevar
        System.out.println(elevar);
    }
    
}
