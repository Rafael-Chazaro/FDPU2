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
public class Ejercicio16 {
    public static void main(String[] args) {
        
        //Escribir "ingrese un valor para calcular su IVA"
        System.out.println("ingrese un valor para calcular su IVA");
        
        // Leer Valor
        Scanner Leer = new Scanner(System.in);
        double Valor = Leer.nextDouble();
        
        // IVA <- Valor * 0.16
        double IVA = Valor * 0.16;
        
        // Escribir IVA
        System.out.println(IVA);
        
    }
}
