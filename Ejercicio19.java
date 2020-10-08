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
public class Ejercicio19 {
 public static void main(String[] args) {
     
        //Escribir "Ingrese el número de dólares a convertir:"
        System.out.println("Ingrese el número de dólares a convertir");
        
	//Leer Dolar
        Scanner Leer = new Scanner (System.in);
        double Dolar = Leer.nextDouble();
        
	//Pesos <- Dolar * 21.41
        double Pesos = Dolar * 21.41;
        
	//Escribir Pesos
        System.out.println(Pesos);
    }
}
