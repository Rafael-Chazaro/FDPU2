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
public class Ejercicio14 {
    public static void main(String[] args) {
        
        // Escribir "ingrese el salario diario:"
        System.out.println("ingrese el salario diario:");
        
        //Leer SalarioDiario
        Scanner Leer = new Scanner (System.in);
        double SalarioDiario = Leer.nextDouble();
        
        // SalarioMensual <- SalarioDiario * 30
        double SalarioMensual = SalarioDiario * 30;
        
        System.out.println(SalarioMensual);
    }
}
