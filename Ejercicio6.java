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
public class Ejercicio6 {
    public static void main(String[] args) {
        
         // Esribir "ingrese el primer numero:"
         System.out.println("ingrese el primer numero:");
         
         // Leer PrimerNumero
         Scanner Leer = new Scanner (System.in);
         double PrimerNumero = Leer.nextDouble();
         
         // Esribir "ingrese el segundo numero:"
         System.out.println("ingrese el segundo numero:");
         
         // Leer SegundoNumero
         double SegundoNumero = Leer.nextDouble();
         
         // Div <- PrimerNumero / SegundoNumero
         double Div  = PrimerNumero / SegundoNumero;
         
         //Escribir Div
         System.out.println(Div);
    }
}
