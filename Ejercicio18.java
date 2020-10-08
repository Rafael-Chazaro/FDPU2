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
public class Ejercicio18 {
 public static void main(String[] args) {
     
        //Escribir "Ingrese el número de metros a convertir:"
        System.out.println("Ingrese el número de metros a convertir");
        
	//Leer Metros
        Scanner Leer = new Scanner (System.in);
        double Metros = Leer.nextDouble();
        
	//Km <- Metros / 1000
        double Km = Metros / 1000;
        
	//Escribir Km
        System.out.println(Km);
    }
    
}
