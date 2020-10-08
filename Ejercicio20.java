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
public class Ejercicio20 {
     public static void main(String[] args) {
         
        //Escribir "Ingrese la cantidad de pesos a convertir:"
        System.out.println("Ingrese la cantidad de pesos a convertir");
        
	//Leer pesos
        Scanner Leer = new Scanner (System.in);
        double pesos = Leer.nextDouble();
        
	//Dolar <- pesos / 41.51
        double Dolar = pesos / 21.41;
        
	//Escribir Dolar
        System.out.println(Dolar);
    }
    
}
