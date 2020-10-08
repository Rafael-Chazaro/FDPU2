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
public class Ejercicio15 {
    public static void main(String[] args) {
        
        // Escirbir "ingrese el salario por horas:"
        System.out.println("ingrese el salario por horas:");
        
        // Leer SalarioHora
        Scanner Leer = new Scanner(System.in);
        double SalarioHora = Leer.nextDouble();
        
        // SalarioDiario <- SalarioHora * 8
        double SalarioDiario = SalarioHora * 8;
        
        // SalarioMes = Salario * 30
        double SalarioMes = SalarioDiario * 30;
        
        //Escirbir SalarioMes
        System.out.println(SalarioMes);
        
        
        
    }
}
